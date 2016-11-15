package io.vertx.groovy.ext.sql;
public class GroovyExtension {
  public static io.vertx.ext.sql.SQLConnection query(io.vertx.ext.sql.SQLConnection j_receiver, java.lang.String sql, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<String, Object>>> resultHandler) {
    io.vertx.lang.groovy.ConversionHelper.wrap(j_receiver.query(sql,
      resultHandler != null ? new io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.ResultSet>>() {
      public void handle(io.vertx.core.AsyncResult<io.vertx.ext.sql.ResultSet> ar) {
        resultHandler.handle(ar.map(event -> io.vertx.lang.groovy.ConversionHelper.applyIfNotNull(event, a -> io.vertx.lang.groovy.ConversionHelper.fromJsonObject(a.toJson()))));
      }
    } : null));
    return j_receiver;
  }
  public static io.vertx.ext.sql.SQLConnection queryWithParams(io.vertx.ext.sql.SQLConnection j_receiver, java.lang.String sql, java.util.List<Object> params, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<String, Object>>> resultHandler) {
    io.vertx.lang.groovy.ConversionHelper.wrap(j_receiver.queryWithParams(sql,
      params != null ? io.vertx.lang.groovy.ConversionHelper.toJsonArray(params) : null,
      resultHandler != null ? new io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.ResultSet>>() {
      public void handle(io.vertx.core.AsyncResult<io.vertx.ext.sql.ResultSet> ar) {
        resultHandler.handle(ar.map(event -> io.vertx.lang.groovy.ConversionHelper.applyIfNotNull(event, a -> io.vertx.lang.groovy.ConversionHelper.fromJsonObject(a.toJson()))));
      }
    } : null));
    return j_receiver;
  }
  public static io.vertx.ext.sql.SQLConnection queryStreamWithParams(io.vertx.ext.sql.SQLConnection j_receiver, java.lang.String sql, java.util.List<Object> params, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.SQLRowStream>> handler) {
    io.vertx.lang.groovy.ConversionHelper.wrap(j_receiver.queryStreamWithParams(sql,
      params != null ? io.vertx.lang.groovy.ConversionHelper.toJsonArray(params) : null,
      handler != null ? new io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.SQLRowStream>>() {
      public void handle(io.vertx.core.AsyncResult<io.vertx.ext.sql.SQLRowStream> ar) {
        handler.handle(ar.map(event -> io.vertx.lang.groovy.ConversionHelper.wrap(event)));
      }
    } : null));
    return j_receiver;
  }
  public static io.vertx.ext.sql.SQLConnection update(io.vertx.ext.sql.SQLConnection j_receiver, java.lang.String sql, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<String, Object>>> resultHandler) {
    io.vertx.lang.groovy.ConversionHelper.wrap(j_receiver.update(sql,
      resultHandler != null ? new io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.UpdateResult>>() {
      public void handle(io.vertx.core.AsyncResult<io.vertx.ext.sql.UpdateResult> ar) {
        resultHandler.handle(ar.map(event -> io.vertx.lang.groovy.ConversionHelper.applyIfNotNull(event, a -> io.vertx.lang.groovy.ConversionHelper.fromJsonObject(a.toJson()))));
      }
    } : null));
    return j_receiver;
  }
  public static io.vertx.ext.sql.SQLConnection updateWithParams(io.vertx.ext.sql.SQLConnection j_receiver, java.lang.String sql, java.util.List<Object> params, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<String, Object>>> resultHandler) {
    io.vertx.lang.groovy.ConversionHelper.wrap(j_receiver.updateWithParams(sql,
      params != null ? io.vertx.lang.groovy.ConversionHelper.toJsonArray(params) : null,
      resultHandler != null ? new io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.UpdateResult>>() {
      public void handle(io.vertx.core.AsyncResult<io.vertx.ext.sql.UpdateResult> ar) {
        resultHandler.handle(ar.map(event -> io.vertx.lang.groovy.ConversionHelper.applyIfNotNull(event, a -> io.vertx.lang.groovy.ConversionHelper.fromJsonObject(a.toJson()))));
      }
    } : null));
    return j_receiver;
  }
  public static io.vertx.ext.sql.SQLConnection call(io.vertx.ext.sql.SQLConnection j_receiver, java.lang.String sql, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<String, Object>>> resultHandler) {
    io.vertx.lang.groovy.ConversionHelper.wrap(j_receiver.call(sql,
      resultHandler != null ? new io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.ResultSet>>() {
      public void handle(io.vertx.core.AsyncResult<io.vertx.ext.sql.ResultSet> ar) {
        resultHandler.handle(ar.map(event -> io.vertx.lang.groovy.ConversionHelper.applyIfNotNull(event, a -> io.vertx.lang.groovy.ConversionHelper.fromJsonObject(a.toJson()))));
      }
    } : null));
    return j_receiver;
  }
  public static io.vertx.ext.sql.SQLConnection callWithParams(io.vertx.ext.sql.SQLConnection j_receiver, java.lang.String sql, java.util.List<Object> params, java.util.List<Object> outputs, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<String, Object>>> resultHandler) {
    io.vertx.lang.groovy.ConversionHelper.wrap(j_receiver.callWithParams(sql,
      params != null ? io.vertx.lang.groovy.ConversionHelper.toJsonArray(params) : null,
      outputs != null ? io.vertx.lang.groovy.ConversionHelper.toJsonArray(outputs) : null,
      resultHandler != null ? new io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.ResultSet>>() {
      public void handle(io.vertx.core.AsyncResult<io.vertx.ext.sql.ResultSet> ar) {
        resultHandler.handle(ar.map(event -> io.vertx.lang.groovy.ConversionHelper.applyIfNotNull(event, a -> io.vertx.lang.groovy.ConversionHelper.fromJsonObject(a.toJson()))));
      }
    } : null));
    return j_receiver;
  }
  public static io.vertx.ext.sql.SQLConnection batchWithParams(io.vertx.ext.sql.SQLConnection j_receiver, java.lang.String sqlStatement, java.util.List<java.util.List<Object>> args, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Integer>>> handler) {
    io.vertx.lang.groovy.ConversionHelper.wrap(j_receiver.batchWithParams(sqlStatement,
      args != null ? args.stream().map(elt -> elt != null ? io.vertx.lang.groovy.ConversionHelper.toJsonArray(elt) : null).collect(java.util.stream.Collectors.toList()) : null,
      handler != null ? new io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Integer>>>() {
      public void handle(io.vertx.core.AsyncResult<java.util.List<java.lang.Integer>> ar) {
        handler.handle(ar.map(event -> io.vertx.lang.groovy.ConversionHelper.applyIfNotNull(event, list -> list.stream().map(elt -> elt).collect(java.util.stream.Collectors.toList()))));
      }
    } : null));
    return j_receiver;
  }
  public static io.vertx.ext.sql.SQLConnection batchCallableWithParams(io.vertx.ext.sql.SQLConnection j_receiver, java.lang.String sqlStatement, java.util.List<java.util.List<Object>> inArgs, java.util.List<java.util.List<Object>> outArgs, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Integer>>> handler) {
    io.vertx.lang.groovy.ConversionHelper.wrap(j_receiver.batchCallableWithParams(sqlStatement,
      inArgs != null ? inArgs.stream().map(elt -> elt != null ? io.vertx.lang.groovy.ConversionHelper.toJsonArray(elt) : null).collect(java.util.stream.Collectors.toList()) : null,
      outArgs != null ? outArgs.stream().map(elt -> elt != null ? io.vertx.lang.groovy.ConversionHelper.toJsonArray(elt) : null).collect(java.util.stream.Collectors.toList()) : null,
      handler != null ? new io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Integer>>>() {
      public void handle(io.vertx.core.AsyncResult<java.util.List<java.lang.Integer>> ar) {
        handler.handle(ar.map(event -> io.vertx.lang.groovy.ConversionHelper.applyIfNotNull(event, list -> list.stream().map(elt -> elt).collect(java.util.stream.Collectors.toList()))));
      }
    } : null));
    return j_receiver;
  }
  public static io.vertx.core.streams.ReadStream<io.vertx.core.json.JsonArray> handler(io.vertx.ext.sql.SQLRowStream j_receiver, io.vertx.core.Handler<java.util.List<Object>> arg0) {
    io.vertx.lang.groovy.ConversionHelper.wrap(j_receiver.handler(arg0 != null ? event -> arg0.handle(io.vertx.lang.groovy.ConversionHelper.fromJsonArray(event)) : null));
    return j_receiver;
  }
}