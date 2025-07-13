package p352u5;

/* renamed from: u5.w */
/* loaded from: classes.dex */
public class C6334w extends p352u5.C6321j {
    public C6334w(java.io.IOException r1, p352u5.C6323l r2, int r3, int r4) {
            r0 = this;
            int r2 = m12985a(r3, r4)
            r0.<init>(r1, r2)
            return
    }

    public C6334w(java.lang.String r1, java.io.IOException r2, p352u5.C6323l r3, int r4, int r5) {
            r0 = this;
            int r3 = m12985a(r4, r5)
            r0.<init>(r1, r2, r3)
            return
    }

    public C6334w(java.lang.String r1, p352u5.C6323l r2, int r3, int r4) {
            r0 = this;
            int r2 = m12985a(r3, r4)
            r0.<init>(r1, r2)
            return
    }

    public C6334w(p352u5.C6323l r1, int r2, int r3) {
            r0 = this;
            int r1 = m12985a(r2, r3)
            r0.<init>(r1)
            return
    }

    /* renamed from: a */
    public static int m12985a(int r1, int r2) {
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r1 != r0) goto L9
            r0 = 1
            if (r2 != r0) goto L9
            r1 = 2001(0x7d1, float:2.804E-42)
        L9:
            return r1
    }

    /* renamed from: b */
    public static p352u5.C6334w m12986b(java.io.IOException r3, p352u5.C6323l r4, int r5) {
            java.lang.String r0 = r3.getMessage()
            boolean r1 = r3 instanceof java.net.SocketTimeoutException
            r2 = 2007(0x7d7, float:2.812E-42)
            if (r1 == 0) goto Ld
            r0 = 2002(0x7d2, float:2.805E-42)
            goto L27
        Ld:
            boolean r1 = r3 instanceof java.io.InterruptedIOException
            if (r1 == 0) goto L14
            r0 = 1004(0x3ec, float:1.407E-42)
            goto L27
        L14:
            if (r0 == 0) goto L25
            java.lang.String r0 = p185k7.C3836i.m8629n(r0)
            java.lang.String r1 = "cleartext.*not permitted.*"
            boolean r0 = r0.matches(r1)
            if (r0 == 0) goto L25
            r0 = 2007(0x7d7, float:2.812E-42)
            goto L27
        L25:
            r0 = 2001(0x7d1, float:2.804E-42)
        L27:
            if (r0 != r2) goto L2f
            u5.u r5 = new u5.u
            r5.<init>(r3, r4)
            goto L35
        L2f:
            u5.w r1 = new u5.w
            r1.<init>(r3, r4, r0, r5)
            r5 = r1
        L35:
            return r5
    }
}
