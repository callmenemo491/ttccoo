package p417xf;

/* renamed from: xf.b */
/* loaded from: classes.dex */
public final class C7048b {
    private static final java.lang.String getUrl(java.lang.String r3) {
            java.lang.String r0 = "http"
            r1 = 0
            r2 = 2
            boolean r0 = p362uh.C6463i.m13061R(r3, r0, r1, r2)
            if (r0 == 0) goto Lb
            goto L1b
        Lb:
            java.lang.String r0 = "Qm"
            boolean r0 = p362uh.C6463i.m13061R(r3, r0, r1, r2)
            if (r0 == 0) goto L1a
            java.lang.String r0 = "https://cdn.tacocrypto.io/default/resize:fit:400:400:0/plain/"
            java.lang.String r3 = p064e.C1493g.m4049a(r0, r3)
            goto L1b
        L1a:
            r3 = 0
        L1b:
            return r3
    }

    public static final java.util.List<p361uf.AbstractC6432a> mapToAssetData(java.util.Map<java.lang.String, ? extends java.lang.Object> r5) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            uf.c r2 = new uf.c
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.getValue()
            java.lang.String r4 = r4.toString()
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = getUrl(r1)
            r2.<init>(r3, r4, r1)
            r0.add(r2)
            goto L16
        L45:
            return r0
    }
}
