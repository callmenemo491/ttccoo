package p124h7;

/* renamed from: h7.if */
/* loaded from: classes.dex */
public final class C2681if extends p270p6.AbstractC5367a implements p124h7.InterfaceC2534ad {
    public static final android.os.Parcelable.Creator<p124h7.C2681if> CREATOR = null;

    /* renamed from: Y */
    public java.lang.String f11642Y;

    /* renamed from: Z */
    public java.lang.String f11643Z;

    /* renamed from: a0 */
    public java.lang.String f11644a0;

    /* renamed from: b0 */
    public java.lang.String f11645b0;

    /* renamed from: c0 */
    public java.lang.String f11646c0;

    /* renamed from: d0 */
    public java.lang.String f11647d0;

    /* renamed from: e0 */
    public java.lang.String f11648e0;

    /* renamed from: f0 */
    public java.lang.String f11649f0;

    /* renamed from: g0 */
    public boolean f11650g0;

    /* renamed from: h0 */
    public boolean f11651h0;

    /* renamed from: i0 */
    public java.lang.String f11652i0;

    /* renamed from: j0 */
    public java.lang.String f11653j0;

    /* renamed from: k0 */
    public java.lang.String f11654k0;

    /* renamed from: l0 */
    public java.lang.String f11655l0;

    /* renamed from: m0 */
    public boolean f11656m0;

    /* renamed from: n0 */
    public java.lang.String f11657n0;

    static {
            h7.jf r0 = new h7.jf
            r0.<init>()
            p124h7.C2681if.CREATOR = r0
            return
    }

    public C2681if() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f11650g0 = r0
            r1.f11651h0 = r0
            return
    }

    public C2681if(p124h7.C2535ae r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = r2.f11375Z
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            r1.f11653j0 = r0
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            r1.f11654k0 = r3
            java.lang.String r2 = r2.f11377b0
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f11646c0 = r2
            r2 = 1
            r1.f11650g0 = r2
            java.lang.String r2 = "providerId="
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r3 = r1.f11646c0
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.f11648e0 = r2
            return
    }

    public C2681if(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "http://localhost"
            r1.f11642Y = r0
            r1.f11644a0 = r2
            r1.f11645b0 = r3
            r1.f11649f0 = r5
            r1.f11652i0 = r6
            r1.f11655l0 = r7
            r1.f11657n0 = r8
            r3 = 1
            r1.f11650g0 = r3
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L35
            java.lang.String r2 = r1.f11645b0
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L35
            java.lang.String r2 = r1.f11652i0
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L2d
            goto L35
        L2d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "idToken, accessToken and authCode cannot all be null"
            r2.<init>(r3)
            throw r2
        L35:
            com.google.android.gms.common.internal.C1101a.m3100e(r4)
            r1.f11646c0 = r4
            r2 = 0
            r1.f11647d0 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r1.f11644a0
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r5 = "&"
            if (r4 != 0) goto L59
            java.lang.String r4 = "id_token="
            r2.append(r4)
            java.lang.String r4 = r1.f11644a0
            r2.append(r4)
            r2.append(r5)
        L59:
            java.lang.String r4 = r1.f11645b0
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L6e
            java.lang.String r4 = "access_token="
            r2.append(r4)
            java.lang.String r4 = r1.f11645b0
            r2.append(r4)
            r2.append(r5)
        L6e:
            java.lang.String r4 = r1.f11647d0
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L83
            java.lang.String r4 = "identifier="
            r2.append(r4)
            java.lang.String r4 = r1.f11647d0
            r2.append(r4)
            r2.append(r5)
        L83:
            java.lang.String r4 = r1.f11649f0
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L98
            java.lang.String r4 = "oauth_token_secret="
            r2.append(r4)
            java.lang.String r4 = r1.f11649f0
            r2.append(r4)
            r2.append(r5)
        L98:
            java.lang.String r4 = r1.f11652i0
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto Lad
            java.lang.String r4 = "code="
            r2.append(r4)
            java.lang.String r4 = r1.f11652i0
            r2.append(r4)
            r2.append(r5)
        Lad:
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 != 0) goto Lbe
            java.lang.String r4 = "nonce="
            r2.append(r4)
            r2.append(r9)
            r2.append(r5)
        Lbe:
            java.lang.String r4 = "providerId="
            r2.append(r4)
            java.lang.String r4 = r1.f11646c0
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.f11648e0 = r2
            r1.f11651h0 = r3
            return
    }

    public C2681if(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, boolean r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, boolean r17, java.lang.String r18) {
            r2 = this;
            r0 = r2
            r2.<init>()
            r1 = r3
            r0.f11642Y = r1
            r1 = r4
            r0.f11643Z = r1
            r1 = r5
            r0.f11644a0 = r1
            r1 = r6
            r0.f11645b0 = r1
            r1 = r7
            r0.f11646c0 = r1
            r1 = r8
            r0.f11647d0 = r1
            r1 = r9
            r0.f11648e0 = r1
            r1 = r10
            r0.f11649f0 = r1
            r1 = r11
            r0.f11650g0 = r1
            r1 = r12
            r0.f11651h0 = r1
            r1 = r13
            r0.f11652i0 = r1
            r1 = r14
            r0.f11653j0 = r1
            r1 = r15
            r0.f11654k0 = r1
            r1 = r16
            r0.f11655l0 = r1
            r1 = r17
            r0.f11656m0 = r1
            r1 = r18
            r0.f11657n0 = r1
            return
    }

    @Override // p124h7.InterfaceC2534ad
    /* renamed from: a */
    public final java.lang.String mo27a() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r1 = r3.f11651h0
            java.lang.String r2 = "autoCreate"
            r0.put(r2, r1)
            boolean r1 = r3.f11650g0
            java.lang.String r2 = "returnSecureToken"
            r0.put(r2, r1)
            java.lang.String r1 = r3.f11643Z
            if (r1 == 0) goto L1c
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L1c:
            java.lang.String r1 = r3.f11648e0
            if (r1 == 0) goto L25
            java.lang.String r2 = "postBody"
            r0.put(r2, r1)
        L25:
            java.lang.String r1 = r3.f11655l0
            if (r1 == 0) goto L2e
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L2e:
            java.lang.String r1 = r3.f11657n0
            if (r1 == 0) goto L37
            java.lang.String r2 = "pendingToken"
            r0.put(r2, r1)
        L37:
            java.lang.String r1 = r3.f11653j0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = r3.f11653j0
            java.lang.String r2 = "sessionId"
            r0.put(r2, r1)
        L46:
            java.lang.String r1 = r3.f11654k0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = "requestUri"
            if (r1 != 0) goto L56
            java.lang.String r1 = r3.f11654k0
        L52:
            r0.put(r2, r1)
            goto L5b
        L56:
            java.lang.String r1 = r3.f11642Y
            if (r1 == 0) goto L5b
            goto L52
        L5b:
            boolean r1 = r3.f11656m0
            java.lang.String r2 = "returnIdpCredential"
            r0.put(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            r0 = 2
            java.lang.String r1 = r4.f11642Y
            r2 = 0
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            r0 = 3
            java.lang.String r1 = r4.f11643Z
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            java.lang.String r0 = r4.f11644a0
            r1 = 4
            p270p6.C5369c.m11719g(r5, r1, r0, r2)
            r0 = 5
            java.lang.String r3 = r4.f11645b0
            p270p6.C5369c.m11719g(r5, r0, r3, r2)
            r0 = 6
            java.lang.String r3 = r4.f11646c0
            p270p6.C5369c.m11719g(r5, r0, r3, r2)
            r0 = 7
            java.lang.String r3 = r4.f11647d0
            p270p6.C5369c.m11719g(r5, r0, r3, r2)
            r0 = 8
            java.lang.String r3 = r4.f11648e0
            p270p6.C5369c.m11719g(r5, r0, r3, r2)
            r0 = 9
            java.lang.String r3 = r4.f11649f0
            p270p6.C5369c.m11719g(r5, r0, r3, r2)
            r0 = 10
            boolean r3 = r4.f11650g0
            p270p6.C5369c.m11724l(r5, r0, r1)
            r5.writeInt(r3)
            r0 = 11
            boolean r3 = r4.f11651h0
            p270p6.C5369c.m11724l(r5, r0, r1)
            r5.writeInt(r3)
            r0 = 12
            java.lang.String r3 = r4.f11652i0
            p270p6.C5369c.m11719g(r5, r0, r3, r2)
            r0 = 13
            java.lang.String r3 = r4.f11653j0
            p270p6.C5369c.m11719g(r5, r0, r3, r2)
            r0 = 14
            java.lang.String r3 = r4.f11654k0
            p270p6.C5369c.m11719g(r5, r0, r3, r2)
            r0 = 15
            java.lang.String r3 = r4.f11655l0
            p270p6.C5369c.m11719g(r5, r0, r3, r2)
            r0 = 16
            boolean r3 = r4.f11656m0
            p270p6.C5369c.m11724l(r5, r0, r1)
            r5.writeInt(r3)
            r0 = 17
            java.lang.String r1 = r4.f11657n0
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
