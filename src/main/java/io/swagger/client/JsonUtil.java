/**
 * SMS Fusion API
 * This is the SMS Fusion API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@smsfusion.com.au
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("HLRCallback".equalsIgnoreCase(className)) {
      return new TypeToken<List<HLRCallback>>(){}.getType();
    }
    
    if ("HLRError".equalsIgnoreCase(className)) {
      return new TypeToken<List<HLRError>>(){}.getType();
    }
    
    if ("HLRResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<HLRResult>>(){}.getType();
    }
    
    if ("OutOfCredit".equalsIgnoreCase(className)) {
      return new TypeToken<List<OutOfCredit>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("HLRCallback".equalsIgnoreCase(className)) {
      return new TypeToken<HLRCallback>(){}.getType();
    }
    
    if ("HLRError".equalsIgnoreCase(className)) {
      return new TypeToken<HLRError>(){}.getType();
    }
    
    if ("HLRResult".equalsIgnoreCase(className)) {
      return new TypeToken<HLRResult>(){}.getType();
    }
    
    if ("OutOfCredit".equalsIgnoreCase(className)) {
      return new TypeToken<OutOfCredit>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
