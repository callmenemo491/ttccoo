package p461zj;

/* renamed from: zj.d */
/* loaded from: classes.dex */
public class C7360d extends java.io.BufferedReader {
    public C7360d(java.io.Reader r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* renamed from: a */
    public p461zj.C7358b m14446a() {
            r8 = this;
        L0:
            java.lang.String r0 = r8.readLine()
            if (r0 == 0) goto Lf
            java.lang.String r1 = "-----BEGIN "
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto Lf
            goto L0
        Lf:
            if (r0 == 0) goto L8b
            r1 = 11
            java.lang.String r0 = r0.substring(r1)
            r1 = 45
            int r1 = r0.indexOf(r1)
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            if (r1 <= 0) goto L8b
            java.lang.String r1 = "-----END "
            java.lang.String r1 = p064e.C1493g.m4049a(r1, r0)
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L34:
            java.lang.String r5 = r8.readLine()
            if (r5 == 0) goto L6f
            java.lang.String r6 = ":"
            int r6 = r5.indexOf(r6)
            if (r6 < 0) goto L5f
            r6 = 58
            int r6 = r5.indexOf(r6)
            java.lang.String r7 = r5.substring(r2, r6)
            int r6 = r6 + 1
            java.lang.String r5 = r5.substring(r6)
            java.lang.String r5 = r5.trim()
            zj.a r6 = new zj.a
            r6.<init>(r7, r5)
            r4.add(r6)
            goto L34
        L5f:
            int r6 = r5.indexOf(r1)
            r7 = -1
            if (r6 == r7) goto L67
            goto L6f
        L67:
            java.lang.String r5 = r5.trim()
            r3.append(r5)
            goto L34
        L6f:
            if (r5 == 0) goto L7f
            zj.b r1 = new zj.b
            java.lang.String r2 = r3.toString()
            byte[] r2 = p421xj.C7085a.m14188a(r2)
            r1.<init>(r0, r4, r2)
            return r1
        L7f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = " not found"
            java.lang.String r1 = p064e.C1493g.m4049a(r1, r2)
            r0.<init>(r1)
            throw r0
        L8b:
            r0 = 0
            return r0
    }
}
