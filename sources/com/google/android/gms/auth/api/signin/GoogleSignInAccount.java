package com.google.android.gms.auth.api.signin;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends p270p6.AbstractC5367a implements com.google.android.gms.common.internal.ReflectedParcelable {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> CREATOR = null;

    /* renamed from: Y */
    public final int f5337Y;

    /* renamed from: Z */
    public java.lang.String f5338Z;

    /* renamed from: a0 */
    public java.lang.String f5339a0;

    /* renamed from: b0 */
    public java.lang.String f5340b0;

    /* renamed from: c0 */
    public java.lang.String f5341c0;

    /* renamed from: d0 */
    public android.net.Uri f5342d0;

    /* renamed from: e0 */
    public java.lang.String f5343e0;

    /* renamed from: f0 */
    public long f5344f0;

    /* renamed from: g0 */
    public java.lang.String f5345g0;

    /* renamed from: h0 */
    public java.util.List<com.google.android.gms.common.api.Scope> f5346h0;

    /* renamed from: i0 */
    public java.lang.String f5347i0;

    /* renamed from: j0 */
    public java.lang.String f5348j0;

    /* renamed from: k0 */
    public java.util.Set<com.google.android.gms.common.api.Scope> f5349k0;

    static {
            a6.a r0 = new a6.a
            r0.<init>()
            com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR = r0
            return
    }

    public GoogleSignInAccount(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, android.net.Uri r7, java.lang.String r8, long r9, java.lang.String r11, java.util.List<com.google.android.gms.common.api.Scope> r12, java.lang.String r13, java.lang.String r14) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f5349k0 = r0
            r1.f5337Y = r2
            r1.f5338Z = r3
            r1.f5339a0 = r4
            r1.f5340b0 = r5
            r1.f5341c0 = r6
            r1.f5342d0 = r7
            r1.f5343e0 = r8
            r1.f5344f0 = r9
            r1.f5345g0 = r11
            r1.f5346h0 = r12
            r1.f5347i0 = r13
            r1.f5348j0 = r14
            return
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: Y */
    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount m2925Y(java.lang.String r19) {
            boolean r0 = android.text.TextUtils.isEmpty(r19)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject
            r2 = r19
            r0.<init>(r2)
            java.lang.String r2 = "photoUrl"
            java.lang.String r2 = r0.optString(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L21
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r9 = r2
            goto L22
        L21:
            r9 = r1
        L22:
            java.lang.String r2 = "expirationTime"
            java.lang.String r2 = r0.getString(r2)
            long r2 = java.lang.Long.parseLong(r2)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.lang.String r5 = "grantedScopes"
            org.json.JSONArray r5 = r0.getJSONArray(r5)
            int r6 = r5.length()
            r7 = 0
        L3c:
            if (r7 >= r6) goto L4d
            com.google.android.gms.common.api.Scope r8 = new com.google.android.gms.common.api.Scope
            java.lang.String r10 = r5.getString(r7)
            r8.<init>(r10)
            r4.add(r8)
            int r7 = r7 + 1
            goto L3c
        L4d:
            java.lang.String r5 = "id"
            java.lang.String r5 = r0.optString(r5)
            java.lang.String r6 = "tokenId"
            boolean r7 = r0.has(r6)
            if (r7 == 0) goto L60
            java.lang.String r6 = r0.optString(r6)
            goto L61
        L60:
            r6 = r1
        L61:
            java.lang.String r7 = "email"
            boolean r8 = r0.has(r7)
            if (r8 == 0) goto L6e
            java.lang.String r7 = r0.optString(r7)
            goto L6f
        L6e:
            r7 = r1
        L6f:
            java.lang.String r8 = "displayName"
            boolean r10 = r0.has(r8)
            if (r10 == 0) goto L7c
            java.lang.String r8 = r0.optString(r8)
            goto L7d
        L7c:
            r8 = r1
        L7d:
            java.lang.String r10 = "givenName"
            boolean r11 = r0.has(r10)
            if (r11 == 0) goto L8b
            java.lang.String r10 = r0.optString(r10)
            r15 = r10
            goto L8c
        L8b:
            r15 = r1
        L8c:
            java.lang.String r10 = "familyName"
            boolean r11 = r0.has(r10)
            if (r11 == 0) goto L9b
            java.lang.String r10 = r0.optString(r10)
            r16 = r10
            goto L9d
        L9b:
            r16 = r1
        L9d:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "obfuscatedIdentifier"
            java.lang.String r13 = r0.getString(r3)
            if (r2 != 0) goto Lb4
            long r2 = java.lang.System.currentTimeMillis()
            r10 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r10
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        Lb4:
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r14 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount
            r10 = 3
            r11 = 0
            long r17 = r2.longValue()
            com.google.android.gms.common.internal.C1101a.m3100e(r13)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r4)
            r3 = r14
            r4 = r10
            r10 = r11
            r11 = r17
            r1 = r14
            r14 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16)
            java.lang.String r2 = "serverAuthCode"
            boolean r3 = r0.has(r2)
            if (r3 == 0) goto Ldb
            java.lang.String r0 = r0.optString(r2)
            goto Ldc
        Ldb:
            r0 = 0
        Ldc:
            r1.f5343e0 = r0
            return r1
    }

    /* renamed from: X */
    public java.util.Set<com.google.android.gms.common.api.Scope> m2926X() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List<com.google.android.gms.common.api.Scope> r1 = r2.f5346h0
            r0.<init>(r1)
            java.util.Set<com.google.android.gms.common.api.Scope> r1 = r2.f5349k0
            r0.addAll(r1)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r5 != r4) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.auth.api.signin.GoogleSignInAccount
            if (r2 != 0) goto Ld
            return r0
        Ld:
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r5 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r5
            java.lang.String r2 = r5.f5345g0
            java.lang.String r3 = r4.f5345g0
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L28
            java.util.Set r5 = r5.m2926X()
            java.util.Set r2 = r4.m2926X()
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L28
            return r1
        L28:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f5345g0
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r0, r1, r2)
            java.util.Set r1 = r3.m2926X()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r6, int r7) {
            r5 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r6, r0)
            r1 = 1
            int r2 = r5.f5337Y
            r3 = 4
            p270p6.C5369c.m11724l(r6, r1, r3)
            r6.writeInt(r2)
            r1 = 2
            java.lang.String r2 = r5.f5338Z
            r4 = 0
            p270p6.C5369c.m11719g(r6, r1, r2, r4)
            r1 = 3
            java.lang.String r2 = r5.f5339a0
            p270p6.C5369c.m11719g(r6, r1, r2, r4)
            java.lang.String r1 = r5.f5340b0
            p270p6.C5369c.m11719g(r6, r3, r1, r4)
            r1 = 5
            java.lang.String r2 = r5.f5341c0
            p270p6.C5369c.m11719g(r6, r1, r2, r4)
            r1 = 6
            android.net.Uri r2 = r5.f5342d0
            p270p6.C5369c.m11718f(r6, r1, r2, r7, r4)
            r7 = 7
            java.lang.String r1 = r5.f5343e0
            p270p6.C5369c.m11719g(r6, r7, r1, r4)
            long r1 = r5.f5344f0
            r7 = 8
            p270p6.C5369c.m11724l(r6, r7, r7)
            r6.writeLong(r1)
            r7 = 9
            java.lang.String r1 = r5.f5345g0
            p270p6.C5369c.m11719g(r6, r7, r1, r4)
            r7 = 10
            java.util.List<com.google.android.gms.common.api.Scope> r1 = r5.f5346h0
            p270p6.C5369c.m11722j(r6, r7, r1, r4)
            r7 = 11
            java.lang.String r1 = r5.f5347i0
            p270p6.C5369c.m11719g(r6, r7, r1, r4)
            r7 = 12
            java.lang.String r1 = r5.f5348j0
            p270p6.C5369c.m11719g(r6, r7, r1, r4)
            p270p6.C5369c.m11726n(r6, r0)
            return
    }
}
