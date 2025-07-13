package p124h7;

/* renamed from: h7.gd */
/* loaded from: classes.dex */
public final class BinderC2643gd extends p124h7.AbstractBinderC2786oc {

    /* renamed from: a */
    public final /* synthetic */ p124h7.AbstractC2679id f11543a;

    public BinderC2643gd(p124h7.AbstractC2679id r1) {
            r0 = this;
            r0.f11543a = r1
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2804pc
    /* renamed from: G1 */
    public final void mo6748G1(com.google.android.gms.common.api.Status r6) {
            r5 = this;
            java.lang.String r0 = r6.f5537a0
            r1 = 0
            if (r0 != 0) goto L7
            goto La9
        L7:
            java.lang.String r2 = "MISSING_MFA_PENDING_CREDENTIAL"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L18
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r0 = 17081(0x42b9, float:2.3936E-41)
            r6.<init>(r0, r1)
            goto La9
        L18:
            java.lang.String r2 = "MISSING_MFA_ENROLLMENT_ID"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L29
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r0 = 17082(0x42ba, float:2.3937E-41)
            r6.<init>(r0, r1)
            goto La9
        L29:
            java.lang.String r2 = "INVALID_MFA_PENDING_CREDENTIAL"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L3a
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r0 = 17083(0x42bb, float:2.3938E-41)
            r6.<init>(r0, r1)
            goto La9
        L3a:
            java.lang.String r2 = "MFA_ENROLLMENT_NOT_FOUND"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L4a
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r0 = 17084(0x42bc, float:2.394E-41)
            r6.<init>(r0, r1)
            goto La9
        L4a:
            java.lang.String r2 = "ADMIN_ONLY_OPERATION"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L5a
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r0 = 17085(0x42bd, float:2.3941E-41)
            r6.<init>(r0, r1)
            goto La9
        L5a:
            java.lang.String r2 = "UNVERIFIED_EMAIL"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L6a
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r0 = 17086(0x42be, float:2.3943E-41)
            r6.<init>(r0, r1)
            goto La9
        L6a:
            java.lang.String r2 = "SECOND_FACTOR_EXISTS"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L7a
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r0 = 17087(0x42bf, float:2.3944E-41)
            r6.<init>(r0, r1)
            goto La9
        L7a:
            java.lang.String r2 = "SECOND_FACTOR_LIMIT_EXCEEDED"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L8a
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r0 = 17088(0x42c0, float:2.3945E-41)
            r6.<init>(r0, r1)
            goto La9
        L8a:
            java.lang.String r2 = "UNSUPPORTED_FIRST_FACTOR"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L9a
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r0 = 17089(0x42c1, float:2.3947E-41)
            r6.<init>(r0, r1)
            goto La9
        L9a:
            java.lang.String r2 = "EMAIL_CHANGE_NEEDS_VERIFICATION"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto La9
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r0 = 17090(0x42c2, float:2.3948E-41)
            r6.<init>(r0, r1)
        La9:
            h7.id r0 = r5.f11543a
            int r2 = r0.f11628a
            r3 = 8
            r4 = 1
            if (r2 == r3) goto Lc3
            x9.j r0 = r0.f11633f
            if (r0 == 0) goto Lb9
            r0.mo13461b(r6)
        Lb9:
            h7.id r0 = r5.f11543a
            r0.f11639l = r4
            h7.hd r0 = r0.f11640m
            r0.m6806d(r1, r6)
            return
        Lc3:
            r0.f11639l = r4
            throw r1
    }

    @Override // p124h7.InterfaceC2804pc
    /* renamed from: J */
    public final void mo6749J(p124h7.C2931wd r4) {
            r3 = this;
            h7.id r4 = r3.f11543a
            int r4 = r4.f11628a
            r0 = 3
            if (r4 != r0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 36
            r1.<init>(r2)
            java.lang.String r2 = "Unexpected response type "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.google.android.gms.common.internal.C1101a.m3106k(r0, r4)
            h7.id r4 = r3.f11543a
            java.util.Objects.requireNonNull(r4)
            r4.mo6467c()
            boolean r4 = r4.f11639l
            java.lang.String r0 = "no success or failure set on method implementation"
            com.google.android.gms.common.internal.C1101a.m3106k(r4, r0)
            return
    }

    @Override // p124h7.InterfaceC2804pc
    /* renamed from: K */
    public final void mo6750K(p375v9.C6624v r5) {
            r4 = this;
            h7.id r5 = r4.f11543a
            int r5 = r5.f11628a
            r0 = 1
            r1 = 8
            if (r5 != r1) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 36
            r2.<init>(r3)
            java.lang.String r3 = "Unexpected response type "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.google.android.gms.common.internal.C1101a.m3106k(r1, r5)
            h7.id r5 = r4.f11543a
            r5.f11639l = r0
            java.util.Objects.requireNonNull(r5)
            r5 = 0
            throw r5
    }

    @Override // p124h7.InterfaceC2804pc
    /* renamed from: K0 */
    public final void mo6751K0(p124h7.C2752me r5) {
            r4 = this;
            h7.id r0 = r4.f11543a
            int r0 = r0.f11628a
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Unexpected response type: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.common.internal.C1101a.m3106k(r1, r0)
            h7.id r0 = r4.f11543a
            r0.f11635h = r5
            r0.mo6467c()
            boolean r5 = r0.f11639l
            java.lang.String r0 = "no success or failure set on method implementation"
            com.google.android.gms.common.internal.C1101a.m3106k(r5, r0)
            return
    }

    @Override // p124h7.InterfaceC2804pc
    /* renamed from: M1 */
    public final void mo6752M1(java.lang.String r5) {
            r4 = this;
            h7.id r5 = r4.f11543a
            int r5 = r5.f11628a
            r0 = 1
            r1 = 8
            if (r5 != r1) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 36
            r2.<init>(r3)
            java.lang.String r3 = "Unexpected response type "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.google.android.gms.common.internal.C1101a.m3106k(r1, r5)
            h7.id r5 = r4.f11543a
            java.util.Objects.requireNonNull(r5)
            r5.f11639l = r0
            h7.id r5 = r4.f11543a
            java.util.Objects.requireNonNull(r5)
            r5 = 0
            throw r5
    }

    @Override // p124h7.InterfaceC2804pc
    /* renamed from: O */
    public final void mo6753O(p124h7.C2910va r4) {
            r3 = this;
            com.google.android.gms.common.api.Status r0 = r4.f11954Y
            v9.j0 r1 = r4.f11955Z
            java.lang.String r2 = r4.f11956a0
            java.lang.String r4 = r4.f11957b0
            r3.m6762x(r0, r1, r2, r4)
            return
    }

    @Override // p124h7.InterfaceC2804pc
    /* renamed from: T0 */
    public final void mo6754T0(p124h7.C2964ya r3) {
            r2 = this;
            h7.id r0 = r2.f11543a
            r0.f11638k = r3
            java.lang.String r3 = "REQUIRES_SECOND_FACTOR_AUTH"
            com.google.android.gms.common.api.Status r3 = p074e9.C1805a.m4514B(r3)
            r1 = 1
            r0.f11639l = r1
            h7.hd r0 = r0.f11640m
            r1 = 0
            r0.m6806d(r1, r3)
            return
    }

    @Override // p124h7.InterfaceC2804pc
    /* renamed from: d1 */
    public final void mo6755d1(p124h7.C2752me r5, p124h7.C2644ge r6) {
            r4 = this;
            h7.id r0 = r4.f11543a
            int r0 = r0.f11628a
            r1 = 2
            if (r0 != r1) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Unexpected response type: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.common.internal.C1101a.m3106k(r1, r0)
            h7.id r0 = r4.f11543a
            r0.f11635h = r5
            r0.f11636i = r6
            r0.mo6467c()
            boolean r5 = r0.f11639l
            java.lang.String r6 = "no success or failure set on method implementation"
            com.google.android.gms.common.internal.C1101a.m3106k(r5, r6)
            return
    }

    @Override // p124h7.InterfaceC2804pc
    /* renamed from: e */
    public final void mo6756e() {
            r4 = this;
            h7.id r0 = r4.f11543a
            int r0 = r0.f11628a
            r1 = 5
            if (r0 != r1) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 36
            r2.<init>(r3)
            java.lang.String r3 = "Unexpected response type "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.common.internal.C1101a.m3106k(r1, r0)
            h7.id r0 = r4.f11543a
            p124h7.AbstractC2679id.m6830h(r0)
            return
    }

    @Override // p124h7.InterfaceC2804pc
    /* renamed from: f1 */
    public final void mo6757f1(p124h7.C2914ve r4) {
            r3 = this;
            h7.id r4 = r3.f11543a
            int r4 = r4.f11628a
            r0 = 4
            if (r4 != r0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 36
            r1.<init>(r2)
            java.lang.String r2 = "Unexpected response type "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.google.android.gms.common.internal.C1101a.m3106k(r0, r4)
            h7.id r4 = r3.f11543a
            java.util.Objects.requireNonNull(r4)
            r4.mo6467c()
            boolean r4 = r4.f11639l
            java.lang.String r0 = "no success or failure set on method implementation"
            com.google.android.gms.common.internal.C1101a.m3106k(r4, r0)
            return
    }

    @Override // p124h7.InterfaceC2804pc
    /* renamed from: l */
    public final void mo6758l() {
            r4 = this;
            h7.id r0 = r4.f11543a
            int r0 = r0.f11628a
            r1 = 9
            if (r0 != r1) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 36
            r2.<init>(r3)
            java.lang.String r3 = "Unexpected response type "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.common.internal.C1101a.m3106k(r1, r0)
            h7.id r0 = r4.f11543a
            p124h7.AbstractC2679id.m6830h(r0)
            return
    }

    @Override // p124h7.InterfaceC2804pc
    /* renamed from: o0 */
    public final void mo6759o0(com.google.android.gms.common.api.Status r5, p375v9.C6624v r6) {
            r4 = this;
            h7.id r0 = r4.f11543a
            int r0 = r0.f11628a
            r1 = 2
            if (r0 != r1) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 36
            r2.<init>(r3)
            java.lang.String r3 = "Unexpected response type "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.common.internal.C1101a.m3106k(r1, r0)
            r0 = 0
            r4.m6762x(r5, r6, r0, r0)
            return
    }

    @Override // p124h7.InterfaceC2804pc
    /* renamed from: o1 */
    public final void mo6760o1(java.lang.String r4) {
            r3 = this;
            h7.id r4 = r3.f11543a
            int r4 = r4.f11628a
            r0 = 8
            if (r4 != r0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 36
            r1.<init>(r2)
            java.lang.String r2 = "Unexpected response type "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.google.android.gms.common.internal.C1101a.m3106k(r0, r4)
            h7.id r4 = r3.f11543a
            java.util.Objects.requireNonNull(r4)
            h7.id r4 = r3.f11543a
            java.util.Objects.requireNonNull(r4)
            r4 = 0
            throw r4
    }

    @Override // p124h7.InterfaceC2804pc
    /* renamed from: w0 */
    public final void mo6761w0(java.lang.String r4) {
            r3 = this;
            h7.id r4 = r3.f11543a
            int r4 = r4.f11628a
            r0 = 7
            if (r4 != r0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 36
            r1.<init>(r2)
            java.lang.String r2 = "Unexpected response type "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.google.android.gms.common.internal.C1101a.m3106k(r0, r4)
            h7.id r4 = r3.f11543a
            java.util.Objects.requireNonNull(r4)
            r4.mo6467c()
            boolean r4 = r4.f11639l
            java.lang.String r0 = "no success or failure set on method implementation"
            com.google.android.gms.common.internal.C1101a.m3106k(r4, r0)
            return
    }

    /* renamed from: x */
    public final void m6762x(com.google.android.gms.common.api.Status r1, p375v9.AbstractC6590c r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            h7.id r3 = r0.f11543a
            x9.j r3 = r3.f11633f
            if (r3 == 0) goto L9
            r3.mo13461b(r1)
        L9:
            h7.id r3 = r0.f11543a
            r3.f11637j = r2
            x9.j r2 = r3.f11633f
            if (r2 == 0) goto L14
            r2.mo13461b(r1)
        L14:
            h7.id r2 = r0.f11543a
            r3 = 1
            r2.f11639l = r3
            h7.hd r2 = r2.f11640m
            r3 = 0
            r2.m6806d(r3, r1)
            return
    }

    @Override // p124h7.InterfaceC2804pc
    /* renamed from: y */
    public final void mo6763y() {
            r4 = this;
            h7.id r0 = r4.f11543a
            int r0 = r0.f11628a
            r1 = 6
            if (r0 != r1) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 36
            r2.<init>(r3)
            java.lang.String r3 = "Unexpected response type "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.common.internal.C1101a.m3106k(r1, r0)
            h7.id r0 = r4.f11543a
            p124h7.AbstractC2679id.m6830h(r0)
            return
    }
}
