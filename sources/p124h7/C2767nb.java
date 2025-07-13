package p124h7;

/* renamed from: h7.nb */
/* loaded from: classes.dex */
public final class C2767nb extends p124h7.AbstractC2679id<p375v9.InterfaceC6592d, p411x9.InterfaceC7004w> {

    /* renamed from: n */
    public final p375v9.C6594e f11787n;

    public C2767nb(p375v9.C6594e r3) {
            r2 = this;
            r0 = 2
            r2.<init>(r0)
            r2.f11787n = r3
            java.lang.String r0 = r3.f25775Y
            java.lang.String r1 = "email cannot be null"
            com.google.android.gms.common.internal.C1101a.m3101f(r0, r1)
            java.lang.String r3 = r3.f25776Z
            java.lang.String r0 = "password cannot be null"
            com.google.android.gms.common.internal.C1101a.m3101f(r3, r0)
            return
    }

    @Override // p124h7.InterfaceC2677ib
    /* renamed from: a */
    public final p218m6.AbstractC4398k<p124h7.InterfaceC2642gc, p375v9.InterfaceC6592d> mo6465a() {
            r2 = this;
            m6.k$a r0 = p218m6.AbstractC4398k.m9834a()
            f.t r1 = new f.t
            r1.<init>(r2)
            r0.f17961a = r1
            m6.k r0 = r0.m9835a()
            return r0
    }

    @Override // p124h7.InterfaceC2677ib
    /* renamed from: b */
    public final java.lang.String mo6466b() {
            r1 = this;
            java.lang.String r0 = "linkEmailAuthCredential"
            return r0
    }

    @Override // p124h7.AbstractC2679id
    /* renamed from: c */
    public final void mo6467c() {
            r3 = this;
            o9.d r0 = r3.f11630c
            h7.ge r1 = r3.f11636i
            x9.f0 r0 = p124h7.C2588dc.m6595d(r0, r1)
            CallbackT r1 = r3.f11632e
            x9.w r1 = (p411x9.InterfaceC7004w) r1
            h7.me r2 = r3.f11635h
            r1.mo13460a(r2, r0)
            x9.a0 r1 = new x9.a0
            r1.<init>(r0)
            r0 = 1
            r3.f11639l = r0
            h7.hd r0 = r3.f11640m
            r2 = 0
            r0.m6806d(r1, r2)
            return
    }
}
