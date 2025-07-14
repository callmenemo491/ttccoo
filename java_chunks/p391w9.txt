package p391w9;

/* renamed from: w9.a */
/* loaded from: classes.dex */
public final class BinderC6821a extends p248o6.AbstractBinderC4906f {

    /* renamed from: a */
    public final /* synthetic */ com.google.firebase.auth.api.fallback.service.FirebaseAuthFallbackService f26558a;

    public BinderC6821a(com.google.firebase.auth.api.fallback.service.FirebaseAuthFallbackService r1) {
            r0 = this;
            r0.f26558a = r1
            r0.<init>()
            return
    }

    @Override // p248o6.InterfaceC4920m
    /* renamed from: F0 */
    public final void mo11072F0(p248o6.InterfaceC4918l r3, p248o6.C4908g r4) {
            r2 = this;
            android.os.Bundle r4 = r4.f19486e0
            if (r4 == 0) goto L25
            java.lang.String r0 = "com.google.firebase.auth.API_KEY"
            java.lang.String r4 = r4.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L1d
            h7.jc r0 = new h7.jc
            com.google.firebase.auth.api.fallback.service.FirebaseAuthFallbackService r1 = r2.f26558a
            r0.<init>(r1, r4)
            r4 = 0
            r1 = 0
            r3.mo11063h2(r4, r0, r1)
            return
        L1d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "ApiKey must not be empty."
            r3.<init>(r4)
            throw r3
        L25:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "ExtraArgs is null."
            r3.<init>(r4)
            throw r3
    }
}
