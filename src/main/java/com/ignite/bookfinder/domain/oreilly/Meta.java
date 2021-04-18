
package com.ignite.bookfinder.domain.oreilly;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "query_identifier"
})
@Generated("jsonschema2pojo")
public class Meta {

    @JsonProperty("query_identifier")
    private String queryIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("query_identifier")
    public String getQueryIdentifier() {
        return queryIdentifier;
    }

    @JsonProperty("query_identifier")
    public void setQueryIdentifier(String queryIdentifier) {
        this.queryIdentifier = queryIdentifier;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
