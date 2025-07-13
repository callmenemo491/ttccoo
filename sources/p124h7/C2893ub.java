package p124h7;

/* renamed from: h7.ub */
/* loaded from: classes.dex */
public final class C2893ub extends p124h7.AbstractC2679id<p375v9.InterfaceC6592d, p411x9.InterfaceC7004w> {

    /* renamed from: n */
    public final p124h7.C2550ba f11944n;

    public C2893ub(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            java.lang.String r0 = "email cannot be null or empty"
            com.google.android.gms.common.internal.C1101a.m3101f(r2, r0)
            java.lang.String r0 = "password cannot be null or empty"
            com.google.android.gms.common.internal.C1101a.m3101f(r3, r0)
            h7.ba r0 = new h7.ba
            r0.<init>(r2, r3, r4)
            r1.f11944n = r0
            return
    }

    @Override // p124h7.InterfaceC2677ib
    /* renamed from: a */
    public final p218m6.AbstractC4398k<p124h7.InterfaceC2642gc, p375v9.InterfaceC6592d> mo6465a() {
            r2 = this;
            m6.k$a r0 = p218m6.AbstractC4398k.m9834a()
            h7.rb r1 = new h7.rb
            r1.<init>(r2)
            r0.f17961a = r1
            m6.k r0 = r0.m9835a()
            return r0
    }

    @Override // p124h7.InterfaceC2677ib
    /* renamed from: b */
    public final java.lang.String mo6466b() {
            r1 = this;
            java.lang.String r0 = "reauthenticateWithEmailPasswordWithData"
            return r0
    }

    @Override // p124h7.AbstractC2679id
    /* renamed from: c */
    public final void mo6467c() {
            r5 = this;
            o9.d r0 = r5.f11630c
            h7.ge r1 = r5.f11636i
            x9.f0 r0 = p124h7.C2588dc.m6595d(r0, r1)
            v9.o r1 = r5.f11631d
            java.lang.String r1 = r1.mo13465a0()
            x9.c0 r2 = r0.f27264Z
            java.lang.String r2 = r2.f27249Y
            boolean r1 = r1.equalsIgnoreCase(r2)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            CallbackT r1 = r5.f11632e
            x9.w r1 = (p411x9.InterfaceC7004w) r1
            h7.me r4 = r5.f11635h
            r1.mo13460a(r4, r0)
            x9.a0 r1 = new x9.a0
            r1.<init>(r0)
            r5.f11639l = r2
            h7.hd r0 = r5.f11640m
            r0.m6806d(r1, r3)
            return
        L30:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 17024(0x4280, float:2.3856E-41)
            r0.<init>(r1, r3)
            r5.f11639l = r2
            h7.hd r1 = r5.f11640m
            r1.m6806d(r3, r0)
            return
    }
}
