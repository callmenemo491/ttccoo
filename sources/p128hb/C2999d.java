package p128hb;

/* renamed from: hb.d */
/* loaded from: classes.dex */
public class C2999d {

    /* renamed from: f */
    public static final java.util.Date f12099f = null;

    /* renamed from: a */
    public org.json.JSONObject f12100a;

    /* renamed from: b */
    public org.json.JSONObject f12101b;

    /* renamed from: c */
    public java.util.Date f12102c;

    /* renamed from: d */
    public org.json.JSONArray f12103d;

    /* renamed from: e */
    public org.json.JSONObject f12104e;

    static {
            java.util.Date r0 = new java.util.Date
            r1 = 0
            r0.<init>(r1)
            p128hb.C2999d.f12099f = r0
            return
    }

    public C2999d(org.json.JSONObject r5, java.util.Date r6, org.json.JSONArray r7, org.json.JSONObject r8) {
            r4 = this;
            r4.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "configs_key"
            r0.put(r1, r5)
            long r1 = r6.getTime()
            java.lang.String r3 = "fetch_time_key"
            r0.put(r3, r1)
            java.lang.String r1 = "abt_experiments_key"
            r0.put(r1, r7)
            java.lang.String r1 = "personalization_metadata_key"
            r0.put(r1, r8)
            r4.f12101b = r5
            r4.f12102c = r6
            r4.f12103d = r7
            r4.f12104e = r8
            r4.f12100a = r0
            return
    }

    /* renamed from: a */
    public static p128hb.C2999d m7373a(org.json.JSONObject r6) {
            java.lang.String r0 = "personalization_metadata_key"
            org.json.JSONObject r0 = r6.optJSONObject(r0)
            if (r0 != 0) goto Ld
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        Ld:
            hb.d r1 = new hb.d
            java.lang.String r2 = "configs_key"
            org.json.JSONObject r2 = r6.getJSONObject(r2)
            java.util.Date r3 = new java.util.Date
            java.lang.String r4 = "fetch_time_key"
            long r4 = r6.getLong(r4)
            r3.<init>(r4)
            java.lang.String r4 = "abt_experiments_key"
            org.json.JSONArray r6 = r6.getJSONArray(r4)
            r1.<init>(r2, r3, r6, r0)
            return r1
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p128hb.C2999d
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            hb.d r2 = (p128hb.C2999d) r2
            org.json.JSONObject r0 = r1.f12100a
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r2.toString()
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            org.json.JSONObject r0 = r1.f12100a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            org.json.JSONObject r0 = r1.f12100a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
