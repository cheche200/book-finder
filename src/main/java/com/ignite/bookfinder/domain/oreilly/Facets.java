
package com.ignite.bookfinder.domain.oreilly;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "facet_queries",
    "facet_fields",
    "facet_ranges",
    "facet_intervals"
})
@Generated("jsonschema2pojo")
public class Facets {

    @JsonProperty("facet_queries")
    private FacetQueries facetQueries;
    @JsonProperty("facet_fields")
    private FacetFields facetFields;
    @JsonProperty("facet_ranges")
    private FacetRanges facetRanges;
    @JsonProperty("facet_intervals")
    private FacetIntervals facetIntervals;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("facet_queries")
    public FacetQueries getFacetQueries() {
        return facetQueries;
    }

    @JsonProperty("facet_queries")
    public void setFacetQueries(FacetQueries facetQueries) {
        this.facetQueries = facetQueries;
    }

    @JsonProperty("facet_fields")
    public FacetFields getFacetFields() {
        return facetFields;
    }

    @JsonProperty("facet_fields")
    public void setFacetFields(FacetFields facetFields) {
        this.facetFields = facetFields;
    }

    @JsonProperty("facet_ranges")
    public FacetRanges getFacetRanges() {
        return facetRanges;
    }

    @JsonProperty("facet_ranges")
    public void setFacetRanges(FacetRanges facetRanges) {
        this.facetRanges = facetRanges;
    }

    @JsonProperty("facet_intervals")
    public FacetIntervals getFacetIntervals() {
        return facetIntervals;
    }

    @JsonProperty("facet_intervals")
    public void setFacetIntervals(FacetIntervals facetIntervals) {
        this.facetIntervals = facetIntervals;
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
