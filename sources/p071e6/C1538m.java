package p071e6;

/* renamed from: e6.m */
/* loaded from: classes.dex */
public final class C1538m extends com.google.android.gms.cast.framework.media.AbstractC1070g {

    /* renamed from: o */
    public final /* synthetic */ int f7457o;

    /* renamed from: p */
    public final /* synthetic */ java.lang.Object f7458p;

    /* renamed from: q */
    public final /* synthetic */ com.google.android.gms.cast.framework.media.C1065b f7459q;

    public C1538m(com.google.android.gms.cast.framework.media.C1065b r2, p036c6.C0901o r3) {
            r1 = this;
            r0 = 1
            r1.f7457o = r0
            r1.f7459q = r2
            r1.f7458p = r3
            r3 = 0
            r1.<init>(r2, r3)
            return
    }

    public C1538m(com.google.android.gms.cast.framework.media.C1065b r2, int[] r3) {
            r1 = this;
            r0 = 0
            r1.f7457o = r0
            r1.f7459q = r2
            r1.f7458p = r3
            r3 = 1
            r1.<init>(r2, r3)
            return
    }

    @Override // com.google.android.gms.cast.framework.media.AbstractC1070g
    /* renamed from: j */
    public final void mo3034j() {
            r15 = this;
            int r0 = r15.f7457o
            r1 = 0
            java.lang.String r2 = "mediaSessionId"
            java.lang.String r3 = "type"
            r4 = 0
            java.lang.String r5 = "requestId"
            switch(r0) {
                case 0: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L57
        Le:
            com.google.android.gms.cast.framework.media.b r0 = r15.f7459q
            h6.n r0 = r0.f5490c
            h6.p r6 = r15.m3035k()
            java.lang.Object r7 = r15.f7458p
            int[] r7 = (int[]) r7
            java.util.Objects.requireNonNull(r0)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            long r9 = r0.m6415a()
            r8.put(r5, r9)     // Catch: org.json.JSONException -> L4a
            java.lang.String r5 = "QUEUE_GET_ITEMS"
            r8.put(r3, r5)     // Catch: org.json.JSONException -> L4a
            long r11 = r0.m6407p()     // Catch: org.json.JSONException -> L4a
            r8.put(r2, r11)     // Catch: org.json.JSONException -> L4a
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L4a
            r2.<init>()     // Catch: org.json.JSONException -> L4a
            int r3 = r7.length     // Catch: org.json.JSONException -> L4a
        L3b:
            if (r1 >= r3) goto L45
            r5 = r7[r1]     // Catch: org.json.JSONException -> L4a
            r2.put(r5)     // Catch: org.json.JSONException -> L4a
            int r1 = r1 + 1
            goto L3b
        L45:
            java.lang.String r1 = "itemIds"
            r8.put(r1, r2)     // Catch: org.json.JSONException -> L4a
        L4a:
            java.lang.String r1 = r8.toString()
            r0.m6416b(r1, r9, r4)
            h6.q r0 = r0.f11320u
            r0.m6409a(r9, r6)
            return
        L57:
            com.google.android.gms.cast.framework.media.b r0 = r15.f7459q
            h6.n r0 = r0.f5490c
            h6.p r6 = r15.m3035k()
            java.lang.Object r7 = r15.f7458p
            c6.o r7 = (p036c6.C0901o) r7
            java.util.Objects.requireNonNull(r0)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            long r9 = r0.m6415a()
            boolean r11 = r7.f4822c
            if (r11 == 0) goto L79
            r11 = 4294967296000(0x3e800000000, double:2.1219957909653E-311)
            goto L7b
        L79:
            long r11 = r7.f4820a
        L7b:
            r8.put(r5, r9)     // Catch: org.json.JSONException -> Lae
            java.lang.String r5 = "SEEK"
            r8.put(r3, r5)     // Catch: org.json.JSONException -> Lae
            long r13 = r0.m6407p()     // Catch: org.json.JSONException -> Lae
            r8.put(r2, r13)     // Catch: org.json.JSONException -> Lae
            java.lang.String r2 = "currentTime"
            double r13 = p123h6.C2487a.m6363b(r11)     // Catch: org.json.JSONException -> Lae
            r8.put(r2, r13)     // Catch: org.json.JSONException -> Lae
            int r2 = r7.f4821b     // Catch: org.json.JSONException -> Lae
            java.lang.String r3 = "resumeState"
            r5 = 1
            if (r2 != r5) goto L9d
            java.lang.String r2 = "PLAYBACK_START"
            goto La2
        L9d:
            r5 = 2
            if (r2 != r5) goto La5
            java.lang.String r2 = "PLAYBACK_PAUSE"
        La2:
            r8.put(r3, r2)     // Catch: org.json.JSONException -> Lae
        La5:
            org.json.JSONObject r2 = r7.f4823d     // Catch: org.json.JSONException -> Lae
            if (r2 == 0) goto Lae
            java.lang.String r3 = "customData"
            r8.put(r3, r2)     // Catch: org.json.JSONException -> Lae
        Lae:
            java.lang.String r2 = r8.toString()
            r0.m6416b(r2, r9, r4)
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r0.f11306g = r2
            h6.q r2 = r0.f11313n
            h6.j r3 = new h6.j
            r3.<init>(r0, r6, r1)
            r2.m6409a(r9, r3)
            return
    }
}
