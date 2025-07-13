package p124h7;

/* renamed from: h7.ve */
/* loaded from: classes.dex */
public final class C2914ve extends p270p6.AbstractC5367a implements p124h7.InterfaceC2553bd<p124h7.C2914ve> {
    public static final android.os.Parcelable.Creator<p124h7.C2914ve> CREATOR = null;

    /* renamed from: c0 */
    public static final java.lang.String f11963c0 = null;

    /* renamed from: Y */
    public java.lang.String f11964Y;

    /* renamed from: Z */
    public java.lang.String f11965Z;

    /* renamed from: a0 */
    public java.lang.String f11966a0;

    /* renamed from: b0 */
    public p124h7.C2788oe f11967b0;

    static {
            java.lang.Class<h7.ve> r0 = p124h7.C2914ve.class
            java.lang.String r0 = r0.getSimpleName()
            p124h7.C2914ve.f11963c0 = r0
            h7.we r0 = new h7.we
            r0.<init>()
            p124h7.C2914ve.CREATOR = r0
            return
    }

    public C2914ve() {
            r0 = this;
            r0.<init>()
            return
    }

    public C2914ve(java.lang.String r1, java.lang.String r2, java.lang.String r3, p124h7.C2788oe r4) {
            r0 = this;
            r0.<init>()
            r0.f11964Y = r1
            r0.f11965Z = r2
            r0.f11966a0 = r3
            r0.f11967b0 = r4
            return
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2553bd mo6512e(java.lang.String r17) {
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r0 = "mfaInfo"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            r3.<init>(r2)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            java.lang.String r4 = "email"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            java.lang.String r4 = p353u6.C6347j.m12998a(r4)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            r1.f11964Y = r4     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            java.lang.String r4 = "newEmail"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            java.lang.String r4 = p353u6.C6347j.m12998a(r4)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            r1.f11965Z = r4     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            java.lang.String r4 = "reqType"
            int r4 = r3.optInt(r4)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            java.lang.String r6 = "REVERT_SECOND_FACTOR_ADDITION"
            java.lang.String r7 = "VERIFY_AND_CHANGE_EMAIL"
            java.lang.String r8 = "EMAIL_SIGNIN"
            java.lang.String r9 = "RECOVER_EMAIL"
            java.lang.String r10 = "VERIFY_EMAIL"
            java.lang.String r11 = "PASSWORD_RESET"
            r12 = 1
            if (r4 == r12) goto L47
            switch(r4) {
                case 4: goto L45;
                case 5: goto L43;
                case 6: goto L41;
                case 7: goto L3f;
                case 8: goto L3d;
                default: goto L3b;
            }
        L3b:
            r4 = 0
            goto L48
        L3d:
            r4 = r6
            goto L48
        L3f:
            r4 = r7
            goto L48
        L41:
            r4 = r8
            goto L48
        L43:
            r4 = r9
            goto L48
        L45:
            r4 = r10
            goto L48
        L47:
            r4 = r11
        L48:
            r1.f11966a0 = r4     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            if (r4 == 0) goto La4
            java.lang.String r4 = "requestType"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            int r13 = r4.hashCode()     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            r15 = 4
            r5 = 3
            r14 = 2
            switch(r13) {
                case -1874510116: goto L89;
                case -1452371317: goto L81;
                case -1341836234: goto L79;
                case -1099157829: goto L71;
                case 870738373: goto L69;
                case 970484929: goto L61;
                default: goto L60;
            }
        L60:
            goto L91
        L61:
            boolean r6 = r4.equals(r9)
            if (r6 == 0) goto L91
            r6 = 4
            goto L92
        L69:
            boolean r6 = r4.equals(r8)
            if (r6 == 0) goto L91
            r6 = 2
            goto L92
        L71:
            boolean r6 = r4.equals(r7)
            if (r6 == 0) goto L91
            r6 = 3
            goto L92
        L79:
            boolean r6 = r4.equals(r10)
            if (r6 == 0) goto L91
            r6 = 0
            goto L92
        L81:
            boolean r6 = r4.equals(r11)
            if (r6 == 0) goto L91
            r6 = 1
            goto L92
        L89:
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L91
            r6 = 5
            goto L92
        L91:
            r6 = -1
        L92:
            if (r6 == 0) goto La1
            if (r6 == r12) goto La1
            if (r6 == r14) goto La1
            if (r6 == r5) goto La1
            if (r6 == r15) goto La1
            r5 = 5
            if (r6 == r5) goto La1
            r5 = 0
            goto La2
        La1:
            r5 = r4
        La2:
            r1.f11966a0 = r5     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
        La4:
            boolean r4 = r3.has(r0)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            if (r4 == 0) goto Lb4
            org.json.JSONObject r0 = r3.optJSONObject(r0)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            h7.oe r0 = p124h7.C2788oe.m7022X(r0)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            r1.f11967b0 = r0     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
        Lb4:
            return r1
        Lb5:
            r0 = move-exception
            goto Lb8
        Lb7:
            r0 = move-exception
        Lb8:
            java.lang.String r3 = p124h7.C2914ve.f11963c0
            h7.kb r0 = p036c6.C0906q0.m2613a(r0, r3, r2)
            throw r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            r1 = 2
            java.lang.String r2 = r4.f11964Y
            r3 = 0
            p270p6.C5369c.m11719g(r5, r1, r2, r3)
            r1 = 3
            java.lang.String r2 = r4.f11965Z
            p270p6.C5369c.m11719g(r5, r1, r2, r3)
            r1 = 4
            java.lang.String r2 = r4.f11966a0
            p270p6.C5369c.m11719g(r5, r1, r2, r3)
            r1 = 5
            h7.oe r2 = r4.f11967b0
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }
}
