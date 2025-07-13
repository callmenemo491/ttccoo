package p071e6;

/* renamed from: e6.o */
/* loaded from: classes.dex */
public final class C1540o extends com.google.android.gms.cast.framework.media.AbstractC1070g {

    /* renamed from: o */
    public final /* synthetic */ double f7460o;

    /* renamed from: p */
    public final /* synthetic */ org.json.JSONObject f7461p;

    /* renamed from: q */
    public final /* synthetic */ com.google.android.gms.cast.framework.media.C1065b f7462q;

    public C1540o(com.google.android.gms.cast.framework.media.C1065b r1, double r2, org.json.JSONObject r4) {
            r0 = this;
            r0.f7462q = r1
            r0.f7460o = r2
            r0.f7461p = r4
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.cast.framework.media.AbstractC1070g
    /* renamed from: j */
    public final void mo3034j() {
            r10 = this;
            com.google.android.gms.cast.framework.media.b r0 = r10.f7462q
            h6.n r0 = r0.f5490c
            h6.p r1 = r10.m3035k()
            double r2 = r10.f7460o
            org.json.JSONObject r4 = r10.f7461p
            c6.p r5 = r0.f11305f
            if (r5 == 0) goto L4f
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            long r6 = r0.m6415a()
            java.lang.String r8 = "requestId"
            r5.put(r8, r6)     // Catch: org.json.JSONException -> L41
            java.lang.String r8 = "type"
            java.lang.String r9 = "SET_PLAYBACK_RATE"
            r5.put(r8, r9)     // Catch: org.json.JSONException -> L41
            java.lang.String r8 = "playbackRate"
            r5.put(r8, r2)     // Catch: org.json.JSONException -> L41
            c6.p r2 = r0.f11305f     // Catch: org.json.JSONException -> L41
            java.lang.String r3 = "mediaStatus should not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r2, r3)     // Catch: org.json.JSONException -> L41
            java.lang.String r2 = "mediaSessionId"
            c6.p r3 = r0.f11305f     // Catch: org.json.JSONException -> L41
            long r8 = r3.f4825Z     // Catch: org.json.JSONException -> L41
            r5.put(r2, r8)     // Catch: org.json.JSONException -> L41
            if (r4 == 0) goto L41
            java.lang.String r2 = "customData"
            r5.put(r2, r4)     // Catch: org.json.JSONException -> L41
        L41:
            java.lang.String r2 = r5.toString()
            r3 = 0
            r0.m6416b(r2, r6, r3)
            h6.q r0 = r0.f11322w
            r0.m6409a(r6, r1)
            return
        L4f:
            h6.l r0 = new h6.l
            r0.<init>()
            throw r0
    }
}
