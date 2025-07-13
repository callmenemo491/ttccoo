package p238nd;

@p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.utils.PreferenceExtensionsKt$observeKey$1", m7452f = "PreferenceExtensions.kt", m7453l = {}, m7454m = "invokeSuspend")
/* renamed from: nd.h1 */
/* loaded from: classes.dex */
public final class C4747h1 extends p134hh.AbstractC3048i implements mh.InterfaceC4625q<p419xh.InterfaceC7074b<? super java.lang.Boolean>, java.lang.Throwable, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

    /* renamed from: c0 */
    public final /* synthetic */ android.content.SharedPreferences f19047c0;

    /* renamed from: d0 */
    public final /* synthetic */ android.content.SharedPreferences.OnSharedPreferenceChangeListener f19048d0;

    public C4747h1(android.content.SharedPreferences r1, android.content.SharedPreferences.OnSharedPreferenceChangeListener r2, p101fh.InterfaceC2172d r3) {
            r0 = this;
            r0.f19047c0 = r1
            r0.f19048d0 = r2
            r1 = 3
            r0.<init>(r1, r3)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public java.lang.Object mo115i(p419xh.InterfaceC7074b<? super java.lang.Boolean> r2, java.lang.Throwable r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
            r1 = this;
            xh.b r2 = (p419xh.InterfaceC7074b) r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            fh.d r4 = (p101fh.InterfaceC2172d) r4
            nd.h1 r2 = new nd.h1
            android.content.SharedPreferences r3 = r1.f19047c0
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r0 = r1.f19048d0
            r2.<init>(r3, r0, r4)
            ch.l r2 = ch.C0985l.f5061a
            p074e9.C1805a.m4540y(r2)
            r3.unregisterOnSharedPreferenceChangeListener(r0)
            return r2
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r2) {
            r1 = this;
            p074e9.C1805a.m4540y(r2)
            android.content.SharedPreferences r2 = r1.f19047c0
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r0 = r1.f19048d0
            r2.unregisterOnSharedPreferenceChangeListener(r0)
            ch.l r2 = ch.C0985l.f5061a
            return r2
    }
}
