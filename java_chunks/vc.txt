package vc;

/* renamed from: vc.a */
/* loaded from: classes.dex */
public class C6631a implements p394wc.InterfaceC6830a {
    public C6631a(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p394wc.InterfaceC6830a
    /* renamed from: a */
    public java.lang.String mo13491a(java.lang.String r13) {
            r12 = this;
            bi.y$a r0 = bi.C0805y.f4365f
            java.lang.String r0 = "application/json"
            bi.y r0 = bi.C0805y.a.m2460b(r0)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r13
            java.lang.String r13 = "{\"account_name\": \"%s\"}"
            java.lang.String r13 = java.lang.String.format(r13, r2)
            java.lang.String r2 = "content"
            p214m2.C4339q.m9706k(r13, r2)
            java.nio.charset.Charset r2 = p362uh.C6455a.f25034b
            r4 = 0
            if (r0 == 0) goto L3d
            java.util.regex.Pattern r5 = bi.C0805y.f4363d
            java.nio.charset.Charset r5 = r0.m2458a(r4)
            if (r5 != 0) goto L3c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = "; charset=utf-8"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            bi.y r0 = bi.C0805y.a.m2460b(r0)
            goto L3d
        L3c:
            r2 = r5
        L3d:
            byte[] r13 = r13.getBytes(r2)
            java.lang.String r2 = "(this as java.lang.String).getBytes(charset)"
            p214m2.C4339q.m9705j(r13, r2)
            int r2 = r13.length
            int r5 = r13.length
            long r6 = (long) r5
            long r8 = (long) r3
            long r10 = (long) r2
            ci.C0988c.m2697b(r6, r8, r10)
            bi.e0 r5 = new bi.e0
            r5.<init>(r13, r0, r2, r3)
            bi.c0$a r13 = new bi.c0$a
            r13.<init>()
            java.lang.String r0 = "https://eos.greymass.com"
            java.lang.String r2 = "ws:"
            boolean r2 = p362uh.C6463i.m13059P(r0, r2, r1)
            if (r2 == 0) goto L6a
            java.lang.String r1 = "http:"
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            r2 = 3
            goto L79
        L6a:
            java.lang.String r2 = "wss:"
            boolean r1 = p362uh.C6463i.m13059P(r0, r2, r1)
            if (r1 == 0) goto L89
            java.lang.String r1 = "https:"
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            r2 = 4
        L79:
            java.lang.String r0 = r0.substring(r2)
            java.lang.String r2 = "(this as java.lang.String).substring(startIndex)"
            p214m2.C4339q.m9705j(r0, r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L89:
            java.lang.String r1 = "$this$toHttpUrl"
            p214m2.C4339q.m9706k(r0, r1)
            bi.w$a r1 = new bi.w$a
            r1.<init>()
            r1.m2450d(r4, r0)
            bi.w r0 = r1.m2447a()
            r13.m2369e(r0)
            java.lang.String r0 = "POST"
            r13.m2367c(r0, r5)
            bi.c0 r13 = r13.m2365a()
            bi.a0 r0 = new bi.a0
            bi.a0$a r1 = new bi.a0$a
            r1.<init>()
            r0.<init>(r1)
            fi.c r1 = new fi.c     // Catch: java.io.IOException -> Lc0
            r1.<init>(r0, r13, r3)     // Catch: java.io.IOException -> Lc0
            bi.g0 r13 = r1.mo2377h()     // Catch: java.io.IOException -> Lc0
            bi.h0 r13 = r13.f4231e0     // Catch: java.io.IOException -> Lc0
            java.lang.String r13 = r13.toString()     // Catch: java.io.IOException -> Lc0
            return r13
        Lc0:
            r13 = move-exception
            r13.printStackTrace()
            return r4
    }
}
