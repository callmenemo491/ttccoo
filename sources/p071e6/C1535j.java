package p071e6;

/* renamed from: e6.j */
/* loaded from: classes.dex */
public final class C1535j extends com.google.android.gms.cast.framework.media.AbstractC1070g {

    /* renamed from: o */
    public final /* synthetic */ int f7447o;

    /* renamed from: p */
    public final /* synthetic */ org.json.JSONObject f7448p;

    /* renamed from: q */
    public final /* synthetic */ com.google.android.gms.cast.framework.media.C1065b f7449q;

    public C1535j(com.google.android.gms.cast.framework.media.C1065b r3, org.json.JSONObject r4, int r5) {
            r2 = this;
            r2.f7447o = r5
            r0 = 1
            r1 = 0
            if (r5 == r0) goto L2f
            r0 = 2
            if (r5 == r0) goto L27
            r0 = 3
            if (r5 == r0) goto L1f
            r0 = 4
            if (r5 == r0) goto L17
            r2.f7449q = r3
            r2.f7448p = r4
            r2.<init>(r3, r1)
            return
        L17:
            r2.f7449q = r3
            r2.f7448p = r4
            r2.<init>(r3, r1)
            return
        L1f:
            r2.f7449q = r3
            r2.f7448p = r4
            r2.<init>(r3, r1)
            return
        L27:
            r2.f7449q = r3
            r2.f7448p = r4
            r2.<init>(r3, r1)
            return
        L2f:
            r2.f7449q = r3
            r2.f7448p = r4
            r2.<init>(r3, r1)
            return
    }

    @Override // com.google.android.gms.cast.framework.media.AbstractC1070g
    /* renamed from: j */
    public final void mo3034j() {
            r13 = this;
            int r0 = r13.f7447o
            java.lang.String r1 = "customData"
            java.lang.String r2 = "mediaSessionId"
            java.lang.String r3 = "type"
            r4 = 0
            java.lang.String r5 = "requestId"
            switch(r0) {
                case 0: goto L93;
                case 1: goto L7e;
                case 2: goto L47;
                case 3: goto L10;
                default: goto Le;
            }
        Le:
            goto La8
        L10:
            com.google.android.gms.cast.framework.media.b r0 = r13.f7449q
            h6.n r0 = r0.f5490c
            h6.p r6 = r13.m3035k()
            org.json.JSONObject r7 = r13.f7448p
            java.util.Objects.requireNonNull(r0)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            long r9 = r0.m6415a()
            r8.put(r5, r9)     // Catch: org.json.JSONException -> L3a
            java.lang.String r5 = "STOP"
            r8.put(r3, r5)     // Catch: org.json.JSONException -> L3a
            long r11 = r0.m6407p()     // Catch: org.json.JSONException -> L3a
            r8.put(r2, r11)     // Catch: org.json.JSONException -> L3a
            if (r7 == 0) goto L3a
            r8.put(r1, r7)     // Catch: org.json.JSONException -> L3a
        L3a:
            java.lang.String r1 = r8.toString()
            r0.m6416b(r1, r9, r4)
            h6.q r0 = r0.f11312m
            r0.m6409a(r9, r6)
            return
        L47:
            com.google.android.gms.cast.framework.media.b r0 = r13.f7449q
            h6.n r0 = r0.f5490c
            h6.p r6 = r13.m3035k()
            org.json.JSONObject r7 = r13.f7448p
            java.util.Objects.requireNonNull(r0)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            long r9 = r0.m6415a()
            r8.put(r5, r9)     // Catch: org.json.JSONException -> L71
            java.lang.String r5 = "PAUSE"
            r8.put(r3, r5)     // Catch: org.json.JSONException -> L71
            long r11 = r0.m6407p()     // Catch: org.json.JSONException -> L71
            r8.put(r2, r11)     // Catch: org.json.JSONException -> L71
            if (r7 == 0) goto L71
            r8.put(r1, r7)     // Catch: org.json.JSONException -> L71
        L71:
            java.lang.String r1 = r8.toString()
            r0.m6416b(r1, r9, r4)
            h6.q r0 = r0.f11310k
            r0.m6409a(r9, r6)
            return
        L7e:
            com.google.android.gms.cast.framework.media.b r0 = r13.f7449q
            h6.n r1 = r0.f5490c
            h6.p r2 = r13.m3035k()
            r3 = 0
            r4 = -1
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            org.json.JSONObject r10 = r13.f7448p
            r1.m6396c(r2, r3, r4, r6, r7, r8, r9, r10)
            return
        L93:
            com.google.android.gms.cast.framework.media.b r0 = r13.f7449q
            h6.n r1 = r0.f5490c
            h6.p r2 = r13.m3035k()
            r3 = 0
            r4 = -1
            r6 = 0
            r7 = -1
            r8 = 0
            r9 = 0
            org.json.JSONObject r10 = r13.f7448p
            r1.m6396c(r2, r3, r4, r6, r7, r8, r9, r10)
            return
        La8:
            com.google.android.gms.cast.framework.media.b r0 = r13.f7449q
            h6.n r0 = r0.f5490c
            h6.p r6 = r13.m3035k()
            org.json.JSONObject r7 = r13.f7448p
            java.util.Objects.requireNonNull(r0)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            long r9 = r0.m6415a()
            r8.put(r5, r9)     // Catch: org.json.JSONException -> Ld2
            java.lang.String r5 = "PLAY"
            r8.put(r3, r5)     // Catch: org.json.JSONException -> Ld2
            long r11 = r0.m6407p()     // Catch: org.json.JSONException -> Ld2
            r8.put(r2, r11)     // Catch: org.json.JSONException -> Ld2
            if (r7 == 0) goto Ld2
            r8.put(r1, r7)     // Catch: org.json.JSONException -> Ld2
        Ld2:
            java.lang.String r1 = r8.toString()
            r0.m6416b(r1, r9, r4)
            h6.q r0 = r0.f11311l
            r0.m6409a(r9, r6)
            return
    }
}
