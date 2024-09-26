package com.android.identity.crypto

import com.android.identity.cbor.DataItem
import com.android.identity.jvm.crypto.X509Cert

/**
 * A data type for a X509 certificate.
 *
 * @param encodedCertificate the bytes of the X.509 certificate.
 */
class X509Cert(
    encodedCertificate: ByteArray
) {
    /**
     * The encoded certificate.
     */
    val encodedCertificate: ByteArray? = null

    /**
     * Gets an [DataItem] with the encoded X.509 certificate.
     */
    fun toDataItem(): DataItem? = null

    /**
     * Encode this certificate in PEM format
     *
     * @return a PEM encoded string.
     */
    fun toPem(): String? = null

    /**
     * The public key in the certificate, as an Elliptic Curve key.
     *
     * Note that this is only supported for curves in [Crypto.supportedCurves].
     *
     * @throws IllegalStateException if the public key for the certificate isn't an EC key or
     * supported by the platform.
     */
    val ecPublicKey: EcPublicKey? = null

    companion object {
        /**
         * Creates a [X509Cert] from a PEM encoded string.
         *
         * @param pemEncoding the PEM encoded string.
         * @return a new [X509Cert].
         */
        fun fromPem(pemEncoding: String): X509Cert? = null

        /**
         * Gets a [X509Cert] from a [DataItem].
         *
         * @param dataItem the data item, must have been encoded with [toDataItem].
         * @return the certificate.
         */
        fun fromDataItem(dataItem: DataItem): X509Cert? = null
    }
}
