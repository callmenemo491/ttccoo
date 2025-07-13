package p271p7;

/* renamed from: p7.b */
/* loaded from: classes.dex */
public final class C5372b extends p201l6.C4181a.a<p287q7.C5583a, p271p7.C5371a> {
    public C5372b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p201l6.C4181a.a
    /* renamed from: a */
    public final p201l6.C4181a.e mo2942a(android.content.Context r9, android.os.Looper r10, p248o6.C4902d r11, p271p7.C5371a r12, p201l6.AbstractC4184d.a r13, p201l6.AbstractC4184d.b r14) {
            r8 = this;
            p7.a r12 = (p271p7.C5371a) r12
            q7.a r12 = new q7.a
            p7.a r0 = r11.f19464g
            java.lang.Integer r1 = r11.f19465h
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            android.accounts.Account r2 = r11.f19458a
            java.lang.String r3 = "com.google.android.gms.signin.internal.clientRequestedAccount"
            r5.putParcelable(r3, r2)
            if (r1 == 0) goto L1f
            int r1 = r1.intValue()
            java.lang.String r2 = "com.google.android.gms.common.internal.ClientSettings.sessionId"
            r5.putInt(r2, r1)
        L1f:
            if (r0 == 0) goto L4c
            r0 = 0
            java.lang.String r1 = "com.google.android.gms.signin.internal.offlineAccessRequested"
            r5.putBoolean(r1, r0)
            java.lang.String r1 = "com.google.android.gms.signin.internal.idTokenRequested"
            r5.putBoolean(r1, r0)
            r1 = 0
            java.lang.String r2 = "com.google.android.gms.signin.internal.serverClientId"
            r5.putString(r2, r1)
            r2 = 1
            java.lang.String r3 = "com.google.android.gms.signin.internal.usePromptModeForAuthCode"
            r5.putBoolean(r3, r2)
            java.lang.String r2 = "com.google.android.gms.signin.internal.forceCodeForRefreshToken"
            r5.putBoolean(r2, r0)
            java.lang.String r2 = "com.google.android.gms.signin.internal.hostedDomain"
            r5.putString(r2, r1)
            java.lang.String r2 = "com.google.android.gms.signin.internal.logSessionId"
            r5.putString(r2, r1)
            java.lang.String r1 = "com.google.android.gms.signin.internal.waitForAccessTokenRefresh"
            r5.putBoolean(r1, r0)
        L4c:
            r3 = 1
            r0 = r12
            r1 = r9
            r2 = r10
            r4 = r11
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r12
    }
}
