#!/bin/bash

execdir="$(readlink -f `dirname ${BASH_SOURCE[0]}`)"

DJIGGER_HOME="${DJIGGER_HOME:-$(dirname ${execdir})}"
DJIGGER_CONFDIR="${DJIGGER_CONFDIR:-${DJIGGER_HOME}/conf}"
DJIGGER_LIBDIR="${DJIGGER_LIBDIR:-${DJIGGER_HOME}/lib}"

START_OPTS=()
START_OPTS+=("-DcollectorConfig=${DJIGGER_CONFDIR}/Collector.xml")
START_OPTS+=("-Dlogback.configurationFile=${DJIGGER_CONFDIR}/logback-collector.xml")
START_OPTS+=("${JAVA_OPTS}")

cd "${DJIGGER_HOME}" \
    && exec "${JAVA_HOME}java" ${START_OPTS[@]} -cp "${DJIGGER_LIBDIR}/*" io.djigger.collector.server.Server \
    || echo "Error: Invalid DJIGGER_HOME"
