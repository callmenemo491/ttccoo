package p072e7;

/* renamed from: e7.f4 */
/* loaded from: classes.dex */
public final class C1607f4 {
    /* renamed from: a */
    public static java.util.Map<java.lang.Integer, java.lang.Integer> m4192a(android.os.Bundle r2, java.lang.String r3) {
            java.io.Serializable r2 = r2.getSerializable(r3)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto Lb
            e7.s<java.lang.Object, java.lang.Object> r2 = p072e7.C1795z.f7847c0
            return r2
        Lb:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L18
            java.lang.Object r1 = r0.getKey()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.getValue()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.getKey()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r3.put(r1, r0)
            goto L18
        L42:
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r3)
            return r2
    }
}
