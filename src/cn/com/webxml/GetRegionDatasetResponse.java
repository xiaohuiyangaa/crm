
package cn.com.webxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getRegionDatasetResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getRegionDatasetResult"
})
@XmlRootElement(name = "getRegionDatasetResponse")
public class GetRegionDatasetResponse {

    protected GetRegionDatasetResponse.GetRegionDatasetResult getRegionDatasetResult;

    /**
     * ��ȡgetRegionDatasetResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetRegionDatasetResponse.GetRegionDatasetResult }
     *     
     */
    public GetRegionDatasetResponse.GetRegionDatasetResult getGetRegionDatasetResult() {
        return getRegionDatasetResult;
    }

    /**
     * ����getRegionDatasetResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetRegionDatasetResponse.GetRegionDatasetResult }
     *     
     */
    public void setGetRegionDatasetResult(GetRegionDatasetResponse.GetRegionDatasetResult value) {
        this.getRegionDatasetResult = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GetRegionDatasetResult {


    }

}
