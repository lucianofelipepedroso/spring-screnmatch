package br.com.luciano.felipe.scrrenmatch.service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);
}
