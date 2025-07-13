package p411x9;

/* renamed from: x9.r */
/* loaded from: classes.dex */
public final class C6999r implements com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a.a {

    /* renamed from: a */
    public final /* synthetic */ p411x9.C7000s f27294a;

    public C6999r(p411x9.C7000s r1) {
            r0 = this;
            r0.f27294a = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a.a
    /* renamed from: a */
    public final void mo3053a(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L13
            x9.s r2 = r1.f27294a
            java.util.Objects.requireNonNull(r2)
            x9.s r2 = r1.f27294a
            x9.i r2 = r2.f27295a
            android.os.Handler r0 = r2.f27284d
            java.lang.Runnable r2 = r2.f27285e
            r0.removeCallbacks(r2)
            return
        L13:
            x9.s r2 = r1.f27294a
            java.util.Objects.requireNonNull(r2)
            x9.s r2 = r1.f27294a
            java.util.Objects.requireNonNull(r2)
            return
    }
}
