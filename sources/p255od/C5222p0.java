package p255od;

/* renamed from: od.p0 */
/* loaded from: classes.dex */
public final class C5222p0 {
    private final byte[] serializedTransaction;
    private final java.util.List<java.lang.String> signatures;
    private final java.lang.String type;
    private final java.lang.Boolean verified;

    public C5222p0(java.lang.String r1, java.lang.Boolean r2, java.util.List<java.lang.String> r3, byte[] r4) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.verified = r2
            r0.signatures = r3
            r0.serializedTransaction = r4
            return
    }

    public static /* synthetic */ p255od.C5222p0 copy$default(p255od.C5222p0 r0, java.lang.String r1, java.lang.Boolean r2, java.util.List r3, byte[] r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.lang.String r1 = r0.type
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.lang.Boolean r2 = r0.verified
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            java.util.List<java.lang.String> r3 = r0.signatures
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            byte[] r4 = r0.serializedTransaction
        L18:
            od.p0 r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public final java.lang.Boolean component2() {
            r1 = this;
            java.lang.Boolean r0 = r1.verified
            return r0
    }

    public final java.util.List<java.lang.String> component3() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.signatures
            return r0
    }

    public final byte[] component4() {
            r1 = this;
            byte[] r0 = r1.serializedTransaction
            return r0
    }

    public final p255od.C5222p0 copy(java.lang.String r2, java.lang.Boolean r3, java.util.List<java.lang.String> r4, byte[] r5) {
            r1 = this;
            od.p0 r0 = new od.p0
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5222p0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.p0 r5 = (p255od.C5222p0) r5
            java.lang.String r1 = r4.type
            java.lang.String r3 = r5.type
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Boolean r1 = r4.verified
            java.lang.Boolean r3 = r5.verified
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.List<java.lang.String> r1 = r4.signatures
            java.util.List<java.lang.String> r3 = r5.signatures
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            byte[] r1 = r4.serializedTransaction
            byte[] r5 = r5.serializedTransaction
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final byte[] getSerializedTransaction() {
            r1 = this;
            byte[] r0 = r1.serializedTransaction
            return r0
    }

    public final java.util.List<java.lang.String> getSignatures() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.signatures
            return r0
    }

    public final java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public final java.lang.Boolean getVerified() {
            r1 = this;
            java.lang.Boolean r0 = r1.verified
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.type
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            java.lang.Boolean r2 = r3.verified
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.util.List<java.lang.String> r2 = r3.signatures
            if (r2 != 0) goto L20
            r2 = 0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r0 = r0 + r2
            int r0 = r0 * 31
            byte[] r2 = r3.serializedTransaction
            if (r2 != 0) goto L2c
            goto L30
        L2c:
            int r1 = java.util.Arrays.hashCode(r2)
        L30:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "TXSignedResponse(type="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.type
            r0.append(r1)
            java.lang.String r1 = ", verified="
            r0.append(r1)
            java.lang.Boolean r1 = r2.verified
            r0.append(r1)
            java.lang.String r1 = ", signatures="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r2.signatures
            r0.append(r1)
            java.lang.String r1 = ", serializedTransaction="
            r0.append(r1)
            byte[] r1 = r2.serializedTransaction
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
