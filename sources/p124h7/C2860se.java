package p124h7;

/* renamed from: h7.se */
/* loaded from: classes.dex */
public final class C2860se extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p124h7.C2860se> CREATOR = null;

    /* renamed from: Y */
    public final java.util.List<p124h7.C2824qe> f11911Y;

    static {
            h7.te r0 = new h7.te
            r0.<init>()
            p124h7.C2860se.CREATOR = r0
            return
    }

    public C2860se() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f11911Y = r0
            return
    }

    public C2860se(java.util.List<p124h7.C2824qe> r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L10
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L10
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            goto L14
        L10:
            java.util.List r2 = java.util.Collections.emptyList()
        L14:
            r1.f11911Y = r2
            return
    }

    /* renamed from: X */
    public static p124h7.C2860se m7138X(org.json.JSONArray r12) {
            if (r12 == 0) goto L72
            int r0 = r12.length()
            if (r0 != 0) goto L9
            goto L72
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        Lf:
            int r2 = r12.length()
            if (r1 >= r2) goto L6c
            org.json.JSONObject r2 = r12.getJSONObject(r1)
            if (r2 != 0) goto L21
            h7.qe r2 = new h7.qe
            r2.<init>()
            goto L66
        L21:
            h7.qe r11 = new h7.qe
            r3 = 0
            java.lang.String r4 = "federatedId"
            java.lang.String r4 = r2.optString(r4, r3)
            java.lang.String r4 = p353u6.C6347j.m12998a(r4)
            java.lang.String r5 = "displayName"
            java.lang.String r5 = r2.optString(r5, r3)
            java.lang.String r5 = p353u6.C6347j.m12998a(r5)
            java.lang.String r6 = "photoUrl"
            java.lang.String r6 = r2.optString(r6, r3)
            java.lang.String r6 = p353u6.C6347j.m12998a(r6)
            java.lang.String r7 = "providerId"
            java.lang.String r7 = r2.optString(r7, r3)
            java.lang.String r7 = p353u6.C6347j.m12998a(r7)
            r8 = 0
            java.lang.String r9 = "phoneNumber"
            java.lang.String r9 = r2.optString(r9, r3)
            java.lang.String r9 = p353u6.C6347j.m12998a(r9)
            java.lang.String r10 = "email"
            java.lang.String r2 = r2.optString(r10, r3)
            java.lang.String r10 = p353u6.C6347j.m12998a(r2)
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2 = r11
        L66:
            r0.add(r2)
            int r1 = r1 + 1
            goto Lf
        L6c:
            h7.se r12 = new h7.se
            r12.<init>(r0)
            return r12
        L72:
            h7.se r12 = new h7.se
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.<init>(r0)
            return r12
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 2
            java.util.List<h7.qe> r1 = r3.f11911Y
            r2 = 0
            p270p6.C5369c.m11722j(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
