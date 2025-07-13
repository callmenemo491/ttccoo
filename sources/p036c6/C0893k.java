package p036c6;

/* renamed from: c6.k */
/* loaded from: classes.dex */
public class C0893k extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p036c6.C0893k> CREATOR = null;

    /* renamed from: b0 */
    public static final java.lang.String[] f4791b0 = null;

    /* renamed from: c0 */
    public static final p067e2.C1510c f4792c0 = null;

    /* renamed from: Y */
    public final java.util.List<p233n6.C4691a> f4793Y;

    /* renamed from: Z */
    public final android.os.Bundle f4794Z;

    /* renamed from: a0 */
    public int f4795a0;

    static {
            java.lang.String r0 = "none"
            java.lang.String r1 = "String"
            java.lang.String r2 = "int"
            java.lang.String r3 = "double"
            java.lang.String r4 = "ISO-8601 date String"
            java.lang.String r5 = "Time in milliseconds as long"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            p036c6.C0893k.f4791b0 = r0
            c6.o0 r0 = new c6.o0
            r0.<init>()
            p036c6.C0893k.CREATOR = r0
            e2.c r0 = new e2.c
            r1 = 1
            r0.<init>(r1)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.CREATION_DATE"
            java.lang.String r3 = "creationDateTime"
            r4 = 4
            r0.m4102d(r2, r3, r4)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.RELEASE_DATE"
            java.lang.String r3 = "releaseDate"
            r0.m4102d(r2, r3, r4)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.BROADCAST_DATE"
            java.lang.String r3 = "originalAirdate"
            r0.m4102d(r2, r3, r4)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.TITLE"
            java.lang.String r3 = "title"
            r0.m4102d(r2, r3, r1)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.SUBTITLE"
            java.lang.String r3 = "subtitle"
            r0.m4102d(r2, r3, r1)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.ARTIST"
            java.lang.String r3 = "artist"
            r0.m4102d(r2, r3, r1)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.ALBUM_ARTIST"
            java.lang.String r3 = "albumArtist"
            r0.m4102d(r2, r3, r1)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.ALBUM_TITLE"
            java.lang.String r3 = "albumName"
            r0.m4102d(r2, r3, r1)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.COMPOSER"
            java.lang.String r3 = "composer"
            r0.m4102d(r2, r3, r1)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.DISC_NUMBER"
            java.lang.String r3 = "discNumber"
            r4 = 2
            r0.m4102d(r2, r3, r4)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.TRACK_NUMBER"
            java.lang.String r3 = "trackNumber"
            r0.m4102d(r2, r3, r4)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.SEASON_NUMBER"
            java.lang.String r3 = "season"
            r0.m4102d(r2, r3, r4)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.EPISODE_NUMBER"
            java.lang.String r3 = "episode"
            r0.m4102d(r2, r3, r4)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.SERIES_TITLE"
            java.lang.String r3 = "seriesTitle"
            r0.m4102d(r2, r3, r1)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.STUDIO"
            java.lang.String r3 = "studio"
            r0.m4102d(r2, r3, r1)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.WIDTH"
            java.lang.String r3 = "width"
            r0.m4102d(r2, r3, r4)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.HEIGHT"
            java.lang.String r3 = "height"
            r0.m4102d(r2, r3, r4)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.LOCATION_NAME"
            java.lang.String r3 = "location"
            r0.m4102d(r2, r3, r1)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE"
            java.lang.String r3 = "latitude"
            r5 = 3
            r0.m4102d(r2, r3, r5)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE"
            java.lang.String r3 = "longitude"
            r0.m4102d(r2, r3, r5)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.SECTION_DURATION"
            java.lang.String r3 = "sectionDuration"
            r5 = 5
            r0.m4102d(r2, r3, r5)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"
            java.lang.String r3 = "sectionStartTimeInMedia"
            r0.m4102d(r2, r3, r5)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME"
            java.lang.String r3 = "sectionStartAbsoluteTime"
            r0.m4102d(r2, r3, r5)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER"
            java.lang.String r3 = "sectionStartTimeInContainer"
            r0.m4102d(r2, r3, r5)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID"
            java.lang.String r3 = "queueItemId"
            r0.m4102d(r2, r3, r4)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.BOOK_TITLE"
            java.lang.String r3 = "bookTitle"
            r0.m4102d(r2, r3, r1)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.CHAPTER_NUMBER"
            java.lang.String r3 = "chapterNumber"
            r0.m4102d(r2, r3, r4)
            java.lang.String r2 = "com.google.android.gms.cast.metadata.CHAPTER_TITLE"
            java.lang.String r3 = "chapterTitle"
            r0.m4102d(r2, r3, r1)
            p036c6.C0893k.f4792c0 = r0
            return
    }

    public C0893k() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public C0893k(int r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r2.<init>()
            r2.f4793Y = r0
            r2.f4794Z = r1
            r2.f4795a0 = r3
            return
    }

    public C0893k(java.util.List<p233n6.C4691a> r1, android.os.Bundle r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f4793Y = r1
            r0.f4794Z = r2
            r0.f4795a0 = r3
            return
    }

    /* renamed from: a0 */
    public static void m2598a0(@androidx.annotation.RecentlyNonNull java.lang.String r4, int r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L48
            e2.c r0 = p036c6.C0893k.f4792c0
            int r0 = r0.m4101c(r4)
            if (r0 == r5) goto L47
            if (r0 != 0) goto L11
            goto L47
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String[] r1 = p036c6.C0893k.f4791b0
            r5 = r1[r5]
            java.lang.String r1 = java.lang.String.valueOf(r4)
            int r1 = r1.length()
            java.lang.String r2 = java.lang.String.valueOf(r5)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 21
            int r1 = r1 + r2
            r3.<init>(r1)
            java.lang.String r1 = "Value for "
            r3.append(r1)
            r3.append(r4)
            java.lang.String r4 = " must be a "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r4 = r3.toString()
            r0.<init>(r4)
            throw r0
        L47:
            return
        L48:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "null and empty keys are not allowed"
            r4.<init>(r5)
            throw r4
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: X */
    public java.lang.String m2599X(@androidx.annotation.RecentlyNonNull java.lang.String r2) {
            r1 = this;
            r0 = 1
            m2598a0(r2, r0)
            android.os.Bundle r0 = r1.f4794Z
            java.lang.String r2 = r0.getString(r2)
            return r2
    }

    /* renamed from: Y */
    public boolean m2600Y() {
            r1 = this;
            java.util.List<n6.a> r0 = r1.f4793Y
            if (r0 == 0) goto Lc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    /* renamed from: Z */
    public void m2601Z(@androidx.annotation.RecentlyNonNull java.lang.String r2, @androidx.annotation.RecentlyNonNull java.lang.String r3) {
            r1 = this;
            r0 = 1
            m2598a0(r2, r0)
            android.os.Bundle r0 = r1.f4794Z
            r0.putString(r2, r3)
            return
    }

    /* renamed from: b0 */
    public final void m2602b0(@androidx.annotation.RecentlyNonNull org.json.JSONObject r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "metadataType"
            android.os.Bundle r3 = r0.f4794Z
            r3.clear()
            java.util.List<n6.a> r3 = r0.f4793Y
            r3.clear()
            r3 = 0
            r0.f4795a0 = r3
            int r3 = r1.getInt(r2)     // Catch: org.json.JSONException -> L1a
            r0.f4795a0 = r3     // Catch: org.json.JSONException -> L1a
            goto L1b
        L1a:
        L1b:
            java.lang.String r3 = "images"
            org.json.JSONArray r3 = r1.optJSONArray(r3)
            if (r3 == 0) goto L28
            java.util.List<n6.a> r4 = r0.f4793Y
            p144i6.C3091b.m7552b(r4, r3)
        L28:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r0.f4795a0
            java.lang.String r5 = "com.google.android.gms.cast.metadata.RELEASE_DATE"
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            java.lang.String r11 = "com.google.android.gms.cast.metadata.SUBTITLE"
            java.lang.String r12 = "com.google.android.gms.cast.metadata.TITLE"
            if (r4 == 0) goto L9f
            if (r4 == r10) goto L95
            if (r4 == r9) goto L85
            if (r4 == r8) goto L6d
            if (r4 == r7) goto L55
            if (r4 == r6) goto L47
            goto La8
        L47:
            java.lang.String r4 = "com.google.android.gms.cast.metadata.CHAPTER_TITLE"
            java.lang.String r5 = "com.google.android.gms.cast.metadata.CHAPTER_NUMBER"
            java.lang.String r13 = "com.google.android.gms.cast.metadata.BOOK_TITLE"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r12, r13, r11}
            java.util.Collections.addAll(r3, r4)
            goto La8
        L55:
            java.lang.String r11 = "com.google.android.gms.cast.metadata.TITLE"
            java.lang.String r12 = "com.google.android.gms.cast.metadata.ARTIST"
            java.lang.String r13 = "com.google.android.gms.cast.metadata.LOCATION_NAME"
            java.lang.String r14 = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE"
            java.lang.String r15 = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE"
            java.lang.String r16 = "com.google.android.gms.cast.metadata.WIDTH"
            java.lang.String r17 = "com.google.android.gms.cast.metadata.HEIGHT"
            java.lang.String r18 = "com.google.android.gms.cast.metadata.CREATION_DATE"
            java.lang.String[] r4 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18}
            java.util.Collections.addAll(r3, r4)
            goto La8
        L6d:
            java.lang.String r11 = "com.google.android.gms.cast.metadata.TITLE"
            java.lang.String r12 = "com.google.android.gms.cast.metadata.ALBUM_TITLE"
            java.lang.String r13 = "com.google.android.gms.cast.metadata.ARTIST"
            java.lang.String r14 = "com.google.android.gms.cast.metadata.ALBUM_ARTIST"
            java.lang.String r15 = "com.google.android.gms.cast.metadata.COMPOSER"
            java.lang.String r16 = "com.google.android.gms.cast.metadata.TRACK_NUMBER"
            java.lang.String r17 = "com.google.android.gms.cast.metadata.DISC_NUMBER"
            java.lang.String r18 = "com.google.android.gms.cast.metadata.RELEASE_DATE"
            java.lang.String[] r4 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18}
            java.util.Collections.addAll(r3, r4)
            goto La8
        L85:
            java.lang.String r4 = "com.google.android.gms.cast.metadata.SERIES_TITLE"
            java.lang.String r5 = "com.google.android.gms.cast.metadata.SEASON_NUMBER"
            java.lang.String r11 = "com.google.android.gms.cast.metadata.EPISODE_NUMBER"
            java.lang.String r13 = "com.google.android.gms.cast.metadata.BROADCAST_DATE"
            java.lang.String[] r4 = new java.lang.String[]{r12, r4, r5, r11, r13}
            java.util.Collections.addAll(r3, r4)
            goto La8
        L95:
            java.lang.String r4 = "com.google.android.gms.cast.metadata.STUDIO"
            java.lang.String[] r4 = new java.lang.String[]{r12, r4, r11, r5}
            java.util.Collections.addAll(r3, r4)
            goto La8
        L9f:
            java.lang.String r4 = "com.google.android.gms.cast.metadata.ARTIST"
            java.lang.String[] r4 = new java.lang.String[]{r12, r4, r11, r5}
            java.util.Collections.addAll(r3, r4)
        La8:
            java.lang.String r4 = "com.google.android.gms.cast.metadata.SECTION_DURATION"
            java.lang.String r5 = "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"
            java.lang.String r11 = "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME"
            java.lang.String r12 = "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER"
            java.lang.String r13 = "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r11, r12, r13}
            java.util.Collections.addAll(r3, r4)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r3)
            java.util.Iterator r3 = r20.keys()     // Catch: org.json.JSONException -> L17c
        Lc2:
            boolean r5 = r3.hasNext()     // Catch: org.json.JSONException -> L17c
            if (r5 == 0) goto L17c
            java.lang.Object r5 = r3.next()     // Catch: org.json.JSONException -> L17c
            java.lang.String r5 = (java.lang.String) r5     // Catch: org.json.JSONException -> L17c
            if (r5 == 0) goto Lc2
            boolean r11 = r2.equals(r5)     // Catch: org.json.JSONException -> L17c
            if (r11 != 0) goto Lc2
            e2.c r11 = p036c6.C0893k.f4792c0     // Catch: org.json.JSONException -> L17c
            java.util.Map<java.lang.Integer, a2.a<?, ?>> r12 = r11.f7344b     // Catch: org.json.JSONException -> L17c
            java.lang.Object r12 = r12.get(r5)     // Catch: org.json.JSONException -> L17c
            java.lang.String r12 = (java.lang.String) r12     // Catch: org.json.JSONException -> L17c
            if (r12 == 0) goto L149
            boolean r13 = r4.contains(r12)     // Catch: org.json.JSONException -> L17c
            if (r13 == 0) goto Lc2
            java.lang.Object r13 = r1.get(r5)     // Catch: org.json.JSONException -> Lc2
            if (r13 == 0) goto Lc2
            int r11 = r11.m4101c(r12)     // Catch: org.json.JSONException -> Lc2
            if (r11 == r10) goto L13c
            if (r11 == r9) goto L12c
            if (r11 == r8) goto L11c
            if (r11 == r7) goto L10d
            if (r11 == r6) goto Lfd
            goto Lc2
        Lfd:
            android.os.Bundle r11 = r0.f4794Z     // Catch: org.json.JSONException -> Lc2
            long r13 = r1.optLong(r5)     // Catch: org.json.JSONException -> Lc2
            java.util.regex.Pattern r5 = p123h6.C2487a.f11248a     // Catch: org.json.JSONException -> Lc2
            r15 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r15
            r11.putLong(r12, r13)     // Catch: org.json.JSONException -> Lc2
            goto Lc2
        L10d:
            boolean r5 = r13 instanceof java.lang.String     // Catch: org.json.JSONException -> Lc2
            if (r5 == 0) goto Lc2
            java.lang.String r13 = (java.lang.String) r13     // Catch: org.json.JSONException -> Lc2
            java.util.Calendar r5 = p144i6.C3091b.m7551a(r13)     // Catch: org.json.JSONException -> Lc2
            if (r5 == 0) goto Lc2
            android.os.Bundle r5 = r0.f4794Z     // Catch: org.json.JSONException -> Lc2
            goto L144
        L11c:
            double r13 = r1.optDouble(r5)     // Catch: org.json.JSONException -> Lc2
            boolean r5 = java.lang.Double.isNaN(r13)     // Catch: org.json.JSONException -> Lc2
            if (r5 != 0) goto Lc2
            android.os.Bundle r5 = r0.f4794Z     // Catch: org.json.JSONException -> Lc2
            r5.putDouble(r12, r13)     // Catch: org.json.JSONException -> Lc2
            goto Lc2
        L12c:
            boolean r5 = r13 instanceof java.lang.Integer     // Catch: org.json.JSONException -> Lc2
            if (r5 == 0) goto Lc2
            android.os.Bundle r5 = r0.f4794Z     // Catch: org.json.JSONException -> Lc2
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch: org.json.JSONException -> Lc2
            int r11 = r13.intValue()     // Catch: org.json.JSONException -> Lc2
            r5.putInt(r12, r11)     // Catch: org.json.JSONException -> Lc2
            goto Lc2
        L13c:
            boolean r5 = r13 instanceof java.lang.String     // Catch: org.json.JSONException -> Lc2
            if (r5 == 0) goto Lc2
            android.os.Bundle r5 = r0.f4794Z     // Catch: org.json.JSONException -> Lc2
            java.lang.String r13 = (java.lang.String) r13     // Catch: org.json.JSONException -> Lc2
        L144:
            r5.putString(r12, r13)     // Catch: org.json.JSONException -> Lc2
            goto Lc2
        L149:
            java.lang.Object r11 = r1.get(r5)     // Catch: org.json.JSONException -> L17c
            boolean r12 = r11 instanceof java.lang.String     // Catch: org.json.JSONException -> L17c
            if (r12 == 0) goto L15a
            android.os.Bundle r12 = r0.f4794Z     // Catch: org.json.JSONException -> L17c
            java.lang.String r11 = (java.lang.String) r11     // Catch: org.json.JSONException -> L17c
            r12.putString(r5, r11)     // Catch: org.json.JSONException -> L17c
            goto Lc2
        L15a:
            boolean r12 = r11 instanceof java.lang.Integer     // Catch: org.json.JSONException -> L17c
            if (r12 == 0) goto L16b
            android.os.Bundle r12 = r0.f4794Z     // Catch: org.json.JSONException -> L17c
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: org.json.JSONException -> L17c
            int r11 = r11.intValue()     // Catch: org.json.JSONException -> L17c
            r12.putInt(r5, r11)     // Catch: org.json.JSONException -> L17c
            goto Lc2
        L16b:
            boolean r12 = r11 instanceof java.lang.Double     // Catch: org.json.JSONException -> L17c
            if (r12 == 0) goto Lc2
            android.os.Bundle r12 = r0.f4794Z     // Catch: org.json.JSONException -> L17c
            java.lang.Double r11 = (java.lang.Double) r11     // Catch: org.json.JSONException -> L17c
            double r13 = r11.doubleValue()     // Catch: org.json.JSONException -> L17c
            r12.putDouble(r5, r13)     // Catch: org.json.JSONException -> L17c
            goto Lc2
        L17c:
            return
    }

    /* renamed from: c0 */
    public final boolean m2603c0(android.os.Bundle r8, android.os.Bundle r9) {
            r7 = this;
            int r0 = r8.size()
            int r1 = r9.size()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r8.get(r1)
            java.lang.Object r4 = r9.get(r1)
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L3e
            boolean r5 = r4 instanceof android.os.Bundle
            if (r5 == 0) goto L3e
            r5 = r3
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = r4
            android.os.Bundle r6 = (android.os.Bundle) r6
            boolean r5 = r7.m2603c0(r5, r6)
            if (r5 == 0) goto L3d
            goto L3e
        L3d:
            return r2
        L3e:
            if (r3 != 0) goto L49
            if (r4 != 0) goto L48
            boolean r1 = r9.containsKey(r1)
            if (r1 != 0) goto L14
        L48:
            return r2
        L49:
            boolean r1 = r3.equals(r4)
            if (r1 != 0) goto L14
            return r2
        L50:
            r8 = 1
            return r8
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p036c6.C0893k
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.k r5 = (p036c6.C0893k) r5
            android.os.Bundle r1 = r4.f4794Z
            android.os.Bundle r3 = r5.f4794Z
            boolean r1 = r4.m2603c0(r1, r3)
            if (r1 == 0) goto L21
            java.util.List<n6.a> r1 = r4.f4793Y
            java.util.List<n6.a> r5 = r5.f4793Y
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    public int hashCode() {
            r4 = this;
            android.os.Bundle r0 = r4.f4794Z
            r1 = 17
            if (r0 == 0) goto L2c
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            android.os.Bundle r3 = r4.f4794Z
            java.lang.Object r2 = r3.get(r2)
            int r1 = r1 * 31
            if (r2 == 0) goto L29
            int r2 = r2.hashCode()
            goto L2a
        L29:
            r2 = 0
        L2a:
            int r1 = r1 + r2
            goto Le
        L2c:
            int r1 = r1 * 31
            java.util.List<n6.a> r0 = r4.f4793Y
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 2
            java.util.List<n6.a> r1 = r3.f4793Y
            r2 = 0
            p270p6.C5369c.m11722j(r4, r0, r1, r2)
            r0 = 3
            android.os.Bundle r1 = r3.f4794Z
            p270p6.C5369c.m11714b(r4, r0, r1, r2)
            int r0 = r3.f4795a0
            r1 = 4
            p270p6.C5369c.m11724l(r4, r1, r1)
            r4.writeInt(r0)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
