package p124h7;

/* renamed from: h7.mb */
/* loaded from: classes.dex */
public final class C2749mb extends p124h7.AbstractC2679id<p375v9.C6616p, p411x9.InterfaceC7004w> {

    /* renamed from: n */
    public final p124h7.C2530a9 f11769n;

    public C2749mb(java.lang.String r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            java.lang.String r0 = "refresh token cannot be null"
            com.google.android.gms.common.internal.C1101a.m3101f(r2, r0)
            h7.a9 r0 = new h7.a9
            r0.<init>(r2)
            r1.f11769n = r0
            return
    }

    @Override // p124h7.InterfaceC2677ib
    /* renamed from: a */
    public final p218m6.AbstractC4398k<p124h7.InterfaceC2642gc, p375v9.C6616p> mo6465a() {
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
            java.lang.String r0 = "getAccessToken"
            return r0
    }

    @Override // p124h7.AbstractC2679id
    /* renamed from: c */
    public final void mo6467c() {
            r3 = this;
            h7.me r0 = r3.f11635h
            java.lang.String r0 = r0.f11772Y
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L18
            h7.me r0 = r3.f11635h
            h7.a9 r1 = r3.f11769n
            java.lang.String r1 = r1.f11369Y
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            r0.f11772Y = r1
        L18:
            CallbackT r0 = r3.f11632e
            x9.w r0 = (p411x9.InterfaceC7004w) r0
            h7.me r1 = r3.f11635h
            v9.o r2 = r3.f11631d
            r0.mo13460a(r1, r2)
            h7.me r0 = r3.f11635h
            java.lang.String r0 = r0.f11773Z
            v9.p r0 = p411x9.C6993l.m14141a(r0)
            r1 = 1
            r3.f11639l = r1
            h7.hd r1 = r3.f11640m
            r2 = 0
            r1.m6806d(r0, r2)
            return
    }
}
