package p071e6;

/* renamed from: e6.i */
/* loaded from: classes.dex */
public final class C1534i extends com.google.android.gms.cast.framework.media.AbstractC1070g {

    /* renamed from: o */
    public final /* synthetic */ int[] f7444o;

    /* renamed from: p */
    public final /* synthetic */ org.json.JSONObject f7445p;

    /* renamed from: q */
    public final /* synthetic */ com.google.android.gms.cast.framework.media.C1065b f7446q;

    public C1534i(com.google.android.gms.cast.framework.media.C1065b r1, int[] r2, org.json.JSONObject r3) {
            r0 = this;
            r0.f7446q = r1
            r0.f7444o = r2
            r0.f7445p = r3
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.cast.framework.media.AbstractC1070g
    /* renamed from: j */
    public final void mo3034j() {
            r12 = this;
            com.google.android.gms.cast.framework.media.b r0 = r12.f7446q
            h6.n r0 = r0.f5490c
            h6.p r1 = r12.m3035k()
            int[] r2 = r12.f7444o
            org.json.JSONObject r3 = r12.f7445p
            java.util.Objects.requireNonNull(r0)
            if (r2 == 0) goto L71
            int r4 = r2.length
            if (r4 == 0) goto L71
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            long r5 = r0.m6415a()
            r7 = 1
            java.lang.String r8 = "requestId"
            r4.put(r8, r5)     // Catch: org.json.JSONException -> L5e
            java.lang.String r8 = "type"
            java.lang.String r9 = "QUEUE_REMOVE"
            r4.put(r8, r9)     // Catch: org.json.JSONException -> L5e
            java.lang.String r8 = "mediaSessionId"
            long r9 = r0.m6407p()     // Catch: org.json.JSONException -> L5e
            r4.put(r8, r9)     // Catch: org.json.JSONException -> L5e
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch: org.json.JSONException -> L5e
            r8.<init>()     // Catch: org.json.JSONException -> L5e
            r9 = 0
            r10 = 0
        L3a:
            int r11 = r2.length     // Catch: org.json.JSONException -> L5e
            if (r10 >= r11) goto L45
            r11 = r2[r10]     // Catch: org.json.JSONException -> L5e
            r8.put(r10, r11)     // Catch: org.json.JSONException -> L5e
            int r10 = r10 + 1
            goto L3a
        L45:
            java.lang.String r2 = "itemIds"
            r4.put(r2, r8)     // Catch: org.json.JSONException -> L5e
            if (r3 == 0) goto L51
            java.lang.String r2 = "customData"
            r4.put(r2, r3)     // Catch: org.json.JSONException -> L5e
        L51:
            int r2 = r0.f11308i     // Catch: org.json.JSONException -> L5e
            r3 = -1
            if (r2 == r3) goto L57
            r9 = 1
        L57:
            if (r9 == 0) goto L5e
            java.lang.String r3 = "sequenceNumber"
            r4.put(r3, r2)     // Catch: org.json.JSONException -> L5e
        L5e:
            java.lang.String r2 = r4.toString()
            r3 = 0
            r0.m6416b(r2, r5, r3)
            h6.q r2 = r0.f11318s
            h6.j r3 = new h6.j
            r3.<init>(r0, r1, r7)
            r2.m6409a(r5, r3)
            return
        L71:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "itemIdsToRemove must not be null or empty."
            r0.<init>(r1)
            throw r0
    }
}
