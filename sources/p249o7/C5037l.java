package p249o7;

/* renamed from: o7.l */
/* loaded from: classes.dex */
public final class C5037l extends p249o7.AbstractC5050m4 {

    /* renamed from: c */
    public long f19812c;

    /* renamed from: d */
    public java.lang.String f19813d;

    /* renamed from: e */
    public android.accounts.AccountManager f19814e;

    /* renamed from: f */
    public java.lang.Boolean f19815f;

    /* renamed from: g */
    public long f19816g;

    public C5037l(com.google.android.gms.measurement.internal.C1113d r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // p249o7.AbstractC5050m4
    /* renamed from: k */
    public final boolean mo3138k() {
            r5 = this;
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES
            r2 = 15
            int r2 = r0.get(r2)
            r3 = 16
            int r0 = r0.get(r3)
            int r0 = r0 + r2
            long r2 = (long) r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r1.convert(r2, r0)
            r5.f19812c = r0
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = r0.getLanguage()
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r0 = r0.getCountry()
            java.lang.String r0 = r0.toLowerCase(r2)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 1
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "-"
            java.lang.String r0 = p083f.C1932s.m4774a(r4, r1, r2, r0)
            r5.f19813d = r0
            r0 = 0
            return r0
    }

    /* renamed from: p */
    public final long m11290p() {
            r2 = this;
            r2.mo3183i()
            long r0 = r2.f19816g
            return r0
    }

    /* renamed from: q */
    public final long m11291q() {
            r2 = this;
            r2.m11315l()
            long r0 = r2.f19812c
            return r0
    }

    /* renamed from: r */
    public final java.lang.String m11292r() {
            r1 = this;
            r1.m11315l()
            java.lang.String r0 = r1.f19813d
            return r0
    }

    /* renamed from: s */
    public final boolean m11293s() {
            r9 = this;
            java.lang.String r0 = "com.google"
            r9.mo3183i()
            com.google.android.gms.measurement.internal.d r1 = r9.f5736a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r9.f19816g
            long r3 = r1 - r3
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            r7 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L20
            r9.f19815f = r7
        L20:
            java.lang.Boolean r3 = r9.f19815f
            if (r3 != 0) goto La3
            com.google.android.gms.measurement.internal.d r3 = r9.f5736a
            android.content.Context r3 = r3.f5710a
            java.lang.String r4 = "android.permission.GET_ACCOUNTS"
            int r3 = p046d0.C1259a.m3705a(r3, r4)
            r4 = 0
            if (r3 == 0) goto L45
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5676j
            java.lang.String r3 = "Permission error checking for dasher/unicorn accounts"
            r0.m11169c(r3)
        L3e:
            r9.f19816g = r1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.f19815f = r0
            return r4
        L45:
            android.accounts.AccountManager r3 = r9.f19814e
            if (r3 != 0) goto L53
            com.google.android.gms.measurement.internal.d r3 = r9.f5736a
            android.content.Context r3 = r3.f5710a
            android.accounts.AccountManager r3 = android.accounts.AccountManager.get(r3)
            r9.f19814e = r3
        L53:
            android.accounts.AccountManager r3 = r9.f19814e     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            java.lang.String r5 = "service_HOSTED"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            android.accounts.AccountManagerFuture r3 = r3.getAccountsByTypeAndFeatures(r0, r5, r7, r7)     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            java.lang.Object r3 = r3.getResult()     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            android.accounts.Account[] r3 = (android.accounts.Account[]) r3     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            r5 = 1
            if (r3 == 0) goto L72
            int r3 = r3.length     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            if (r3 <= 0) goto L72
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            r9.f19815f = r0     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            r9.f19816g = r1     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            return r5
        L72:
            android.accounts.AccountManager r3 = r9.f19814e     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            java.lang.String r6 = "service_uca"
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            android.accounts.AccountManagerFuture r0 = r3.getAccountsByTypeAndFeatures(r0, r6, r7, r7)     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            java.lang.Object r0 = r0.getResult()     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            android.accounts.Account[] r0 = (android.accounts.Account[]) r0     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            if (r0 == 0) goto L3e
            int r0 = r0.length     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            if (r0 <= 0) goto L3e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            r9.f19815f = r0     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            r9.f19816g = r1     // Catch: android.accounts.OperationCanceledException -> L90 java.io.IOException -> L92 android.accounts.AuthenticatorException -> L94
            return r5
        L90:
            r0 = move-exception
            goto L95
        L92:
            r0 = move-exception
            goto L95
        L94:
            r0 = move-exception
        L95:
            com.google.android.gms.measurement.internal.d r3 = r9.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5673g
            java.lang.String r5 = "Exception checking account types"
            r3.m11170d(r5, r0)
            goto L3e
        La3:
            boolean r0 = r3.booleanValue()
            return r0
    }
}
