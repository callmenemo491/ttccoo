package p414xc;

/* renamed from: xc.j */
/* loaded from: classes.dex */
public class C7035j {
    private static final java.lang.String KEY = "key";
    private static final java.lang.String VALUE = "value";
    private java.lang.String gHexValue;
    private java.lang.String gKey;

    public C7035j(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.gKey = r1
            r0.gHexValue = r2
            return
    }

    public static p414xc.C7035j fromDeserializedJsonObject(p169jb.C3476s r2) {
            java.lang.String r0 = "key"
            jb.p r0 = r2.m7949n(r0)
            java.lang.String r0 = r0.mo7944l()
            java.lang.String r1 = "value"
            jb.p r2 = r2.m7949n(r1)
            jb.t r1 = r2.m7947e()
            java.lang.Object r1 = r1.f14969a
            boolean r1 = r1 instanceof java.lang.String
            if (r1 == 0) goto L24
            xc.j r1 = new xc.j
            java.lang.String r2 = r2.mo7944l()
            r1.<init>(r0, r2)
            return r1
        L24:
            uc.a r2 = new uc.a
            java.lang.String r0 = "InfoPair value should always be a hex string when deserializing"
            r2.<init>(r0)
            throw r2
    }

    public static java.util.List<p414xc.C7035j> listFromDeserializedJsonArray(p169jb.C3470m r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            jb.p r1 = (p169jb.AbstractC3473p) r1
            boolean r2 = r1 instanceof p169jb.C3476s
            if (r2 == 0) goto L23
            jb.s r1 = (p169jb.C3476s) r1
            xc.j r1 = fromDeserializedJsonObject(r1)
            r0.add(r1)
            goto L9
        L23:
            uc.a r3 = new uc.a
            java.lang.String r0 = "Info pairs must be objects"
            r3.<init>(r0)
            throw r3
        L2b:
            return r0
    }

    public byte[] getBytesValue() {
            r7 = this;
            c9.a r0 = p039c9.AbstractC0936a.f4902a
            java.lang.String r1 = r7.gHexValue
            java.util.Objects.requireNonNull(r0)
            java.lang.CharSequence r1 = r0.mo2656c(r1)     // Catch: p039c9.AbstractC0936a.d -> L32
            int r2 = r1.length()     // Catch: p039c9.AbstractC0936a.d -> L32
            r3 = r0
            c9.a$e r3 = (p039c9.AbstractC0936a.e) r3     // Catch: p039c9.AbstractC0936a.d -> L32
            c9.a$a r3 = r3.f4912b     // Catch: p039c9.AbstractC0936a.d -> L32
            int r3 = r3.f4906d     // Catch: p039c9.AbstractC0936a.d -> L32
            long r3 = (long) r3     // Catch: p039c9.AbstractC0936a.d -> L32
            long r5 = (long) r2     // Catch: p039c9.AbstractC0936a.d -> L32
            long r3 = r3 * r5
            r5 = 7
            long r3 = r3 + r5
            r5 = 8
            long r3 = r3 / r5
            int r2 = (int) r3     // Catch: p039c9.AbstractC0936a.d -> L32
            byte[] r3 = new byte[r2]     // Catch: p039c9.AbstractC0936a.d -> L32
            int r0 = r0.mo2654a(r3, r1)     // Catch: p039c9.AbstractC0936a.d -> L32
            if (r0 != r2) goto L2a
            goto L31
        L2a:
            byte[] r1 = new byte[r0]     // Catch: p039c9.AbstractC0936a.d -> L32
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)     // Catch: p039c9.AbstractC0936a.d -> L32
            r3 = r1
        L31:
            return r3
        L32:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }

    public java.lang.String getHexValue() {
            r1 = this;
            java.lang.String r0 = r1.gHexValue
            return r0
    }

    public java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.gKey
            return r0
    }

    public java.lang.String getStringValue() {
            r3 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r3.getBytesValue()
            java.nio.charset.Charset r2 = p362uh.C6455a.f25034b
            r0.<init>(r1, r2)
            return r0
    }

    public void setHexValue(java.lang.String r1) {
            r0 = this;
            r0.gHexValue = r1
            return
    }

    public java.util.Map<java.lang.String, java.lang.Object> toMap() {
            r3 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = r3.gKey
            java.lang.String r2 = "key"
            r0.put(r2, r1)
            java.lang.String r1 = r3.gHexValue
            java.lang.String r2 = "value"
            r0.put(r2, r1)
            return r0
    }
}
