package p083f;

/* renamed from: f.l */
/* loaded from: classes.dex */
public class C1925l implements p227n0.InterfaceC4653l {

    /* renamed from: a */
    public final /* synthetic */ p083f.LayoutInflaterFactory2C1924k f8407a;

    public C1925l(p083f.LayoutInflaterFactory2C1924k r1) {
            r0 = this;
            r0.f8407a = r1
            r0.<init>()
            return
    }

    @Override // p227n0.InterfaceC4653l
    /* renamed from: a */
    public p227n0.C4642a0 mo984a(android.view.View r7, p227n0.C4642a0 r8) {
            r6 = this;
            int r0 = r8.m10468d()
            f.k r1 = r6.f8407a
            r2 = 0
            int r1 = r1.m4756X(r8, r2)
            if (r0 == r1) goto L3f
            int r0 = r8.m10466b()
            int r2 = r8.m10467c()
            int r3 = r8.m10465a()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r4 < r5) goto L25
            n0.a0$d r4 = new n0.a0$d
            r4.<init>(r8)
            goto L34
        L25:
            r5 = 29
            if (r4 < r5) goto L2f
            n0.a0$c r4 = new n0.a0$c
            r4.<init>(r8)
            goto L34
        L2f:
            n0.a0$b r4 = new n0.a0$b
            r4.<init>(r8)
        L34:
            f0.c r8 = p084f0.C1940c.m4827a(r0, r1, r2, r3)
            r4.mo10474d(r8)
            n0.a0 r8 = r4.mo10472b()
        L3f:
            n0.a0 r7 = p227n0.C4661t.m10540p(r7, r8)
            return r7
    }
}
