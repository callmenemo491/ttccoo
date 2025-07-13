package p313rd;

/* renamed from: rd.b */
/* loaded from: classes.dex */
public final class C5815b {

    /* renamed from: a */
    public final android.content.Context f22536a;

    /* renamed from: b */
    public final java.lang.String f22537b;

    /* renamed from: c */
    public final java.util.Map<java.lang.String, java.util.List<android.support.v4.media.MediaMetadataCompat>> f22538c;

    /* renamed from: d */
    public final boolean f22539d;

    public C5815b(android.content.Context r17, p313rd.InterfaceC5816c r18, java.lang.String r19, int r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r16.<init>()
            r0.f22536a = r1
            r0.f22537b = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r0.f22538c = r2
            r3 = 1
            r0.f22539d = r3
            java.lang.String r4 = "/"
            java.lang.Object r5 = r2.get(r4)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L25
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L25:
            android.support.v4.media.MediaMetadataCompat$b r6 = new android.support.v4.media.MediaMetadataCompat$b
            r6.<init>()
            java.lang.String r7 = "android.media.metadata.MEDIA_ID"
            java.lang.String r8 = "__RECOMMENDED__"
            r6.m236d(r7, r8)
            r9 = 2131951968(0x7f130160, float:1.9540365E38)
            java.lang.String r9 = r1.getString(r9)
            java.lang.String r10 = "android.media.metadata.TITLE"
            r6.m236d(r10, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "android.resource://io.tacocrypto.app/drawable/"
            r9.append(r11)
            android.content.res.Resources r12 = r17.getResources()
            r13 = 2131231242(0x7f08020a, float:1.807856E38)
            java.lang.String r12 = r12.getResourceEntryName(r13)
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            java.lang.String r12 = "android.media.metadata.ALBUM_ART_URI"
            r6.m236d(r12, r9)
            long r13 = (long) r3
            java.lang.String r9 = "io.tacocrypto.app.media.METADATA_KEY_UAMP_FLAGS"
            r6.m235c(r9, r13)
            android.support.v4.media.MediaMetadataCompat r6 = r6.m233a()
            android.support.v4.media.MediaMetadataCompat$b r15 = new android.support.v4.media.MediaMetadataCompat$b
            r15.<init>()
            java.lang.String r3 = "__ALBUMS__"
            r15.m236d(r7, r3)
            r3 = 2131951648(0x7f130020, float:1.9539716E38)
            java.lang.String r3 = r1.getString(r3)
            r15.m236d(r10, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            android.content.res.Resources r1 = r17.getResources()
            r10 = 2131231008(0x7f080120, float:1.8078085E38)
            java.lang.String r1 = r1.getResourceEntryName(r10)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r15.m236d(r12, r1)
            r15.m235c(r9, r13)
            android.support.v4.media.MediaMetadataCompat r1 = r15.m233a()
            r5.add(r6)
            r5.add(r1)
            r2.put(r4, r5)
            java.util.Iterator r1 = r18.iterator()
        Lad:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L125
            java.lang.Object r2 = r1.next()
            android.support.v4.media.MediaMetadataCompat r2 = (android.support.v4.media.MediaMetadataCompat) r2
            java.lang.String r3 = "android.media.metadata.ALBUM"
            java.lang.String r3 = r2.m231e(r3)
            java.lang.String r4 = "UTF-8"
            boolean r5 = java.nio.charset.Charset.isSupported(r4)
            java.lang.String r6 = ""
            if (r5 == 0) goto Ld3
            if (r3 != 0) goto Lcc
            r3 = r6
        Lcc:
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)
            java.lang.String r4 = "{\n        URLEncoder.enc\u2026his ?: \"\", \"UTF-8\")\n    }"
            goto Ldc
        Ld3:
            if (r3 != 0) goto Ld6
            r3 = r6
        Ld6:
            java.lang.String r3 = java.net.URLEncoder.encode(r3)
            java.lang.String r4 = "{\n        // If UTF-8 is\u2026.encode(this ?: \"\")\n    }"
        Ldc:
            p214m2.C4339q.m9705j(r3, r4)
            java.util.Map<java.lang.String, java.util.List<android.support.v4.media.MediaMetadataCompat>> r4 = r0.f22538c
            java.lang.Object r3 = r4.get(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto Led
            java.util.List r3 = r0.m12193a(r2)
        Led:
            r3.add(r2)
            java.util.Map<java.lang.String, java.util.List<android.support.v4.media.MediaMetadataCompat>> r3 = r0.f22538c
            java.lang.Object r3 = r3.get(r8)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto Lff
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        Lff:
            r3.add(r2)
            java.util.Map<java.lang.String, java.util.List<android.support.v4.media.MediaMetadataCompat>> r4 = r0.f22538c
            r4.put(r8, r3)
            java.lang.String r3 = r2.m231e(r7)
            java.lang.String r4 = r0.f22537b
            boolean r3 = p214m2.C4339q.m9702c(r3, r4)
            if (r3 == 0) goto Lad
            java.util.Map<java.lang.String, java.util.List<android.support.v4.media.MediaMetadataCompat>> r3 = r0.f22538c
            r4 = 1
            android.support.v4.media.MediaMetadataCompat[] r5 = new android.support.v4.media.MediaMetadataCompat[r4]
            r6 = 0
            r5[r6] = r2
            java.util.List r2 = p074e9.C1805a.m4533r(r5)
            java.lang.String r5 = "__RECENT__"
            r3.put(r5, r2)
            goto Lad
        L125:
            return
    }

    /* renamed from: a */
    public final java.util.List<android.support.v4.media.MediaMetadataCompat> m12193a(android.support.v4.media.MediaMetadataCompat r7) {
            r6 = this;
            android.support.v4.media.MediaMetadataCompat$b r0 = new android.support.v4.media.MediaMetadataCompat$b
            r0.<init>()
            java.lang.String r1 = "android.media.metadata.ALBUM"
            java.lang.String r2 = r7.m231e(r1)
            java.lang.String r3 = "UTF-8"
            boolean r4 = java.nio.charset.Charset.isSupported(r3)
            java.lang.String r5 = ""
            if (r4 == 0) goto L1f
            if (r2 != 0) goto L18
            r2 = r5
        L18:
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r3)
            java.lang.String r3 = "{\n        URLEncoder.enc\u2026his ?: \"\", \"UTF-8\")\n    }"
            goto L28
        L1f:
            if (r2 != 0) goto L22
            r2 = r5
        L22:
            java.lang.String r2 = java.net.URLEncoder.encode(r2)
            java.lang.String r3 = "{\n        // If UTF-8 is\u2026.encode(this ?: \"\")\n    }"
        L28:
            p214m2.C4339q.m9705j(r2, r3)
            java.lang.String r3 = "android.media.metadata.MEDIA_ID"
            r0.m236d(r3, r2)
            java.lang.String r1 = r7.m231e(r1)
            java.lang.String r2 = "android.media.metadata.TITLE"
            r0.m236d(r2, r1)
            java.lang.String r1 = "android.media.metadata.ARTIST"
            java.lang.String r2 = r7.m231e(r1)
            r0.m236d(r1, r2)
            java.lang.String r1 = "android.media.metadata.ALBUM_ART"
            android.graphics.Bitmap r2 = r7.m228b(r1)
            r0.m234b(r1, r2)
            java.lang.String r1 = "android.media.metadata.ALBUM_ART_URI"
            java.lang.String r7 = r7.m231e(r1)
            android.net.Uri r7 = p185k7.C3828h5.m8579H(r7)
            java.lang.String r7 = r7.toString()
            r0.m236d(r1, r7)
            r7 = 1
            long r1 = (long) r7
            java.lang.String r7 = "io.tacocrypto.app.media.METADATA_KEY_UAMP_FLAGS"
            r0.m235c(r7, r1)
            android.support.v4.media.MediaMetadataCompat r7 = r0.m233a()
            java.util.Map<java.lang.String, java.util.List<android.support.v4.media.MediaMetadataCompat>> r0 = r6.f22538c
            java.lang.String r1 = "__ALBUMS__"
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L78
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L78:
            r0.add(r7)
            java.util.Map<java.lang.String, java.util.List<android.support.v4.media.MediaMetadataCompat>> r2 = r6.f22538c
            r2.put(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map<java.lang.String, java.util.List<android.support.v4.media.MediaMetadataCompat>> r1 = r6.f22538c
            java.lang.String r7 = r7.m231e(r3)
            p214m2.C4339q.m9704i(r7)
            r1.put(r7, r0)
            return r0
    }
}
