package p071e6;

/* renamed from: e6.h */
/* loaded from: classes.dex */
public final class C1533h extends com.google.android.gms.cast.framework.media.AbstractC1070g {

    /* renamed from: o */
    public final /* synthetic */ int f7442o;

    /* renamed from: p */
    public final /* synthetic */ com.google.android.gms.cast.framework.media.C1065b f7443p;

    public C1533h(com.google.android.gms.cast.framework.media.C1065b r2, int r3) {
            r1 = this;
            r1.f7442o = r3
            r0 = 1
            if (r3 == r0) goto Lc
            r1.f7443p = r2
            r3 = 0
            r1.<init>(r2, r3)
            return
        Lc:
            r1.f7443p = r2
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.cast.framework.media.AbstractC1070g
    /* renamed from: j */
    public final void mo3034j() {
            r11 = this;
            int r0 = r11.f7442o
            java.lang.String r1 = "mediaSessionId"
            java.lang.String r2 = "type"
            r3 = 0
            java.lang.String r4 = "requestId"
            switch(r0) {
                case 0: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L3f
        Ld:
            com.google.android.gms.cast.framework.media.b r0 = r11.f7443p
            h6.n r0 = r0.f5490c
            h6.p r5 = r11.m3035k()
            java.util.Objects.requireNonNull(r0)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            long r7 = r0.m6415a()
            r6.put(r4, r7)     // Catch: org.json.JSONException -> L32
            java.lang.String r4 = "GET_STATUS"
            r6.put(r2, r4)     // Catch: org.json.JSONException -> L32
            c6.p r2 = r0.f11305f     // Catch: org.json.JSONException -> L32
            if (r2 == 0) goto L32
            long r9 = r2.f4825Z     // Catch: org.json.JSONException -> L32
            r6.put(r1, r9)     // Catch: org.json.JSONException -> L32
        L32:
            java.lang.String r1 = r6.toString()
            r0.m6416b(r1, r7, r3)
            h6.q r0 = r0.f11316q
            r0.m6409a(r7, r5)
            return
        L3f:
            com.google.android.gms.cast.framework.media.b r0 = r11.f7443p
            h6.n r0 = r0.f5490c
            h6.p r5 = r11.m3035k()
            java.util.Objects.requireNonNull(r0)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            long r7 = r0.m6415a()
            r6.put(r4, r7)     // Catch: org.json.JSONException -> L62
            java.lang.String r4 = "QUEUE_GET_ITEM_IDS"
            r6.put(r2, r4)     // Catch: org.json.JSONException -> L62
            long r9 = r0.m6407p()     // Catch: org.json.JSONException -> L62
            r6.put(r1, r9)     // Catch: org.json.JSONException -> L62
        L62:
            java.lang.String r1 = r6.toString()
            r0.m6416b(r1, r7, r3)
            h6.q r0 = r0.f11319t
            r0.m6409a(r7, r5)
            return
    }
}
