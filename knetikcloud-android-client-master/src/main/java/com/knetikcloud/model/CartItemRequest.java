/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.knetikcloud.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CartItemRequest {
  
  @SerializedName("affiliate_key")
  private String affiliateKey = null;
  @SerializedName("catalog_sku")
  private String catalogSku = null;
  @SerializedName("quantity")
  private Integer quantity = null;

  /**
   * The affiliate key of the item
   **/
  @ApiModelProperty(value = "The affiliate key of the item")
  public String getAffiliateKey() {
    return affiliateKey;
  }
  public void setAffiliateKey(String affiliateKey) {
    this.affiliateKey = affiliateKey;
  }

  /**
   * The catalog SKU of the item
   **/
  @ApiModelProperty(required = true, value = "The catalog SKU of the item")
  public String getCatalogSku() {
    return catalogSku;
  }
  public void setCatalogSku(String catalogSku) {
    this.catalogSku = catalogSku;
  }

  /**
   * The quantity of the item
   **/
  @ApiModelProperty(required = true, value = "The quantity of the item")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItemRequest cartItemRequest = (CartItemRequest) o;
    return (this.affiliateKey == null ? cartItemRequest.affiliateKey == null : this.affiliateKey.equals(cartItemRequest.affiliateKey)) &&
        (this.catalogSku == null ? cartItemRequest.catalogSku == null : this.catalogSku.equals(cartItemRequest.catalogSku)) &&
        (this.quantity == null ? cartItemRequest.quantity == null : this.quantity.equals(cartItemRequest.quantity));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.affiliateKey == null ? 0: this.affiliateKey.hashCode());
    result = 31 * result + (this.catalogSku == null ? 0: this.catalogSku.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItemRequest {\n");
    
    sb.append("  affiliateKey: ").append(affiliateKey).append("\n");
    sb.append("  catalogSku: ").append(catalogSku).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
