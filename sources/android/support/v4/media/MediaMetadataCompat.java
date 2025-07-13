package android.support.v4.media;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.MediaMetadataCompat> CREATOR = null;

    /* renamed from: b0 */
    public static final p319s.C5934a<java.lang.String, java.lang.Integer> f494b0 = null;

    /* renamed from: c0 */
    public static final java.lang.String[] f495c0 = null;

    /* renamed from: d0 */
    public static final java.lang.String[] f496d0 = null;

    /* renamed from: e0 */
    public static final java.lang.String[] f497e0 = null;

    /* renamed from: Y */
    public final android.os.Bundle f498Y;

    /* renamed from: Z */
    public android.media.MediaMetadata f499Z;

    /* renamed from: a0 */
    public android.support.v4.media.MediaDescriptionCompat f500a0;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    public class C0138a implements android.os.Parcelable.Creator<android.support.v4.media.MediaMetadataCompat> {
        public C0138a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public android.support.v4.media.MediaMetadataCompat createFromParcel(android.os.Parcel r2) {
                r1 = this;
                android.support.v4.media.MediaMetadataCompat r0 = new android.support.v4.media.MediaMetadataCompat
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public android.support.v4.media.MediaMetadataCompat[] newArray(int r1) {
                r0 = this;
                android.support.v4.media.MediaMetadataCompat[] r1 = new android.support.v4.media.MediaMetadataCompat[r1]
                return r1
        }
    }

    /* renamed from: android.support.v4.media.MediaMetadataCompat$b */
    public static final class C0139b {

        /* renamed from: a */
        public final android.os.Bundle f501a;

        public C0139b() {
                r1 = this;
                r1.<init>()
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r1.f501a = r0
                return
        }

        public C0139b(android.support.v4.media.MediaMetadataCompat r2) {
                r1 = this;
                r1.<init>()
                android.os.Bundle r0 = new android.os.Bundle
                android.os.Bundle r2 = r2.f498Y
                r0.<init>(r2)
                r1.f501a = r0
                android.support.v4.media.session.MediaSessionCompat.m283a(r0)
                return
        }

        /* renamed from: a */
        public android.support.v4.media.MediaMetadataCompat m233a() {
                r2 = this;
                android.support.v4.media.MediaMetadataCompat r0 = new android.support.v4.media.MediaMetadataCompat
                android.os.Bundle r1 = r2.f501a
                r0.<init>(r1)
                return r0
        }

        /* renamed from: b */
        public android.support.v4.media.MediaMetadataCompat.C0139b m234b(java.lang.String r3, android.graphics.Bitmap r4) {
                r2 = this;
                s.a<java.lang.String, java.lang.Integer> r0 = android.support.v4.media.MediaMetadataCompat.f494b0
                int r1 = r0.m12340e(r3)
                if (r1 < 0) goto La
                r1 = 1
                goto Lb
            La:
                r1 = 0
            Lb:
                if (r1 == 0) goto L2a
                r1 = 0
                java.lang.Object r0 = r0.getOrDefault(r3, r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r1 = 2
                if (r0 != r1) goto L1c
                goto L2a
            L1c:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The "
                java.lang.String r1 = " key cannot be used to put a Bitmap"
                java.lang.String r3 = android.support.v4.media.C0145d.m257a(r0, r3, r1)
                r4.<init>(r3)
                throw r4
            L2a:
                android.os.Bundle r0 = r2.f501a
                r0.putParcelable(r3, r4)
                return r2
        }

        /* renamed from: c */
        public android.support.v4.media.MediaMetadataCompat.C0139b m235c(java.lang.String r3, long r4) {
                r2 = this;
                s.a<java.lang.String, java.lang.Integer> r0 = android.support.v4.media.MediaMetadataCompat.f494b0
                int r1 = r0.m12340e(r3)
                if (r1 < 0) goto La
                r1 = 1
                goto Lb
            La:
                r1 = 0
            Lb:
                if (r1 == 0) goto L29
                r1 = 0
                java.lang.Object r0 = r0.getOrDefault(r3, r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                if (r0 != 0) goto L1b
                goto L29
            L1b:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "The "
                java.lang.String r0 = " key cannot be used to put a long"
                java.lang.String r3 = android.support.v4.media.C0145d.m257a(r5, r3, r0)
                r4.<init>(r3)
                throw r4
            L29:
                android.os.Bundle r0 = r2.f501a
                r0.putLong(r3, r4)
                return r2
        }

        /* renamed from: d */
        public android.support.v4.media.MediaMetadataCompat.C0139b m236d(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                s.a<java.lang.String, java.lang.Integer> r0 = android.support.v4.media.MediaMetadataCompat.f494b0
                int r1 = r0.m12340e(r4)
                r2 = 1
                if (r1 < 0) goto Lb
                r1 = 1
                goto Lc
            Lb:
                r1 = 0
            Lc:
                if (r1 == 0) goto L2a
                r1 = 0
                java.lang.Object r0 = r0.getOrDefault(r4, r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                if (r0 != r2) goto L1c
                goto L2a
            L1c:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The "
                java.lang.String r1 = " key cannot be used to put a String"
                java.lang.String r4 = android.support.v4.media.C0145d.m257a(r0, r4, r1)
                r5.<init>(r4)
                throw r5
            L2a:
                android.os.Bundle r0 = r3.f501a
                r0.putCharSequence(r4, r5)
                return r3
        }
    }

    static {
            s.a r0 = new s.a
            r0.<init>()
            android.support.v4.media.MediaMetadataCompat.f494b0 = r0
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "android.media.metadata.TITLE"
            r0.put(r2, r1)
            java.lang.String r2 = "android.media.metadata.ARTIST"
            r0.put(r2, r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "android.media.metadata.DURATION"
            r0.put(r3, r2)
            java.lang.String r3 = "android.media.metadata.ALBUM"
            r0.put(r3, r1)
            java.lang.String r3 = "android.media.metadata.AUTHOR"
            r0.put(r3, r1)
            java.lang.String r3 = "android.media.metadata.WRITER"
            r0.put(r3, r1)
            java.lang.String r3 = "android.media.metadata.COMPOSER"
            r0.put(r3, r1)
            java.lang.String r3 = "android.media.metadata.COMPILATION"
            r0.put(r3, r1)
            java.lang.String r3 = "android.media.metadata.DATE"
            r0.put(r3, r1)
            java.lang.String r3 = "android.media.metadata.YEAR"
            r0.put(r3, r2)
            java.lang.String r3 = "android.media.metadata.GENRE"
            r0.put(r3, r1)
            java.lang.String r3 = "android.media.metadata.TRACK_NUMBER"
            r0.put(r3, r2)
            java.lang.String r3 = "android.media.metadata.NUM_TRACKS"
            r0.put(r3, r2)
            java.lang.String r3 = "android.media.metadata.DISC_NUMBER"
            r0.put(r3, r2)
            java.lang.String r3 = "android.media.metadata.ALBUM_ARTIST"
            r0.put(r3, r1)
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "android.media.metadata.ART"
            r0.put(r4, r3)
            java.lang.String r5 = "android.media.metadata.ART_URI"
            r0.put(r5, r1)
            java.lang.String r6 = "android.media.metadata.ALBUM_ART"
            r0.put(r6, r3)
            java.lang.String r7 = "android.media.metadata.ALBUM_ART_URI"
            r0.put(r7, r1)
            r8 = 3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "android.media.metadata.USER_RATING"
            r0.put(r9, r8)
            java.lang.String r9 = "android.media.metadata.RATING"
            r0.put(r9, r8)
            java.lang.String r8 = "android.media.metadata.DISPLAY_TITLE"
            r0.put(r8, r1)
            java.lang.String r8 = "android.media.metadata.DISPLAY_SUBTITLE"
            r0.put(r8, r1)
            java.lang.String r8 = "android.media.metadata.DISPLAY_DESCRIPTION"
            r0.put(r8, r1)
            java.lang.String r8 = "android.media.metadata.DISPLAY_ICON"
            r0.put(r8, r3)
            java.lang.String r3 = "android.media.metadata.DISPLAY_ICON_URI"
            r0.put(r3, r1)
            java.lang.String r9 = "android.media.metadata.MEDIA_ID"
            r0.put(r9, r1)
            java.lang.String r9 = "android.media.metadata.BT_FOLDER_TYPE"
            r0.put(r9, r2)
            java.lang.String r9 = "android.media.metadata.MEDIA_URI"
            r0.put(r9, r1)
            java.lang.String r1 = "android.media.metadata.ADVERTISEMENT"
            r0.put(r1, r2)
            java.lang.String r1 = "android.media.metadata.DOWNLOAD_STATUS"
            r0.put(r1, r2)
            java.lang.String r9 = "android.media.metadata.TITLE"
            java.lang.String r10 = "android.media.metadata.ARTIST"
            java.lang.String r11 = "android.media.metadata.ALBUM"
            java.lang.String r12 = "android.media.metadata.ALBUM_ARTIST"
            java.lang.String r13 = "android.media.metadata.WRITER"
            java.lang.String r14 = "android.media.metadata.AUTHOR"
            java.lang.String r15 = "android.media.metadata.COMPOSER"
            java.lang.String[] r0 = new java.lang.String[]{r9, r10, r11, r12, r13, r14, r15}
            android.support.v4.media.MediaMetadataCompat.f495c0 = r0
            java.lang.String[] r0 = new java.lang.String[]{r8, r4, r6}
            android.support.v4.media.MediaMetadataCompat.f496d0 = r0
            java.lang.String[] r0 = new java.lang.String[]{r3, r5, r7}
            android.support.v4.media.MediaMetadataCompat.f497e0 = r0
            android.support.v4.media.MediaMetadataCompat$a r0 = new android.support.v4.media.MediaMetadataCompat$a
            r0.<init>()
            android.support.v4.media.MediaMetadataCompat.CREATOR = r0
            return
    }

    public MediaMetadataCompat(android.os.Bundle r2) {
            r1 = this;
            r1.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r2)
            r1.f498Y = r0
            android.support.v4.media.session.MediaSessionCompat.m283a(r0)
            return
    }

    public MediaMetadataCompat(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<android.support.v4.media.session.MediaSessionCompat> r0 = android.support.v4.media.session.MediaSessionCompat.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Bundle r2 = r2.readBundle(r0)
            r1.f498Y = r2
            return
    }

    /* renamed from: a */
    public static android.support.v4.media.MediaMetadataCompat m227a(java.lang.Object r2) {
            if (r2 == 0) goto L1d
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.media.MediaMetadata r2 = (android.media.MediaMetadata) r2
            r1 = 0
            r2.writeToParcel(r0, r1)
            r0.setDataPosition(r1)
            android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r1 = android.support.v4.media.MediaMetadataCompat.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            android.support.v4.media.MediaMetadataCompat r1 = (android.support.v4.media.MediaMetadataCompat) r1
            r0.recycle()
            r1.f499Z = r2
            return r1
        L1d:
            r2 = 0
            return r2
    }

    /* renamed from: b */
    public android.graphics.Bitmap m228b(java.lang.String r3) {
            r2 = this;
            android.os.Bundle r0 = r2.f498Y     // Catch: java.lang.Exception -> L9
            android.os.Parcelable r3 = r0.getParcelable(r3)     // Catch: java.lang.Exception -> L9
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Exception -> L9
            goto L12
        L9:
            r3 = move-exception
            java.lang.String r0 = "MediaMetadata"
            java.lang.String r1 = "Failed to retrieve a key as Bitmap."
            android.util.Log.w(r0, r1, r3)
            r3 = 0
        L12:
            return r3
    }

    /* renamed from: c */
    public android.os.Bundle m229c() {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            android.os.Bundle r1 = r2.f498Y
            r0.<init>(r1)
            return r0
    }

    /* renamed from: d */
    public android.support.v4.media.MediaDescriptionCompat m230d() {
            r14 = this;
            android.support.v4.media.MediaDescriptionCompat r0 = r14.f500a0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "android.media.metadata.MEDIA_ID"
            java.lang.String r2 = r14.m231e(r0)
            r0 = 3
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r0]
            android.os.Bundle r3 = r14.f498Y
            java.lang.String r4 = "android.media.metadata.DISPLAY_TITLE"
            java.lang.CharSequence r3 = r3.getCharSequence(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 2
            r6 = 0
            r7 = 1
            if (r4 != 0) goto L36
            r1[r6] = r3
            android.os.Bundle r0 = r14.f498Y
            java.lang.String r3 = "android.media.metadata.DISPLAY_SUBTITLE"
            java.lang.CharSequence r0 = r0.getCharSequence(r3)
            r1[r7] = r0
            android.os.Bundle r0 = r14.f498Y
            java.lang.String r3 = "android.media.metadata.DISPLAY_DESCRIPTION"
            java.lang.CharSequence r0 = r0.getCharSequence(r3)
            r1[r5] = r0
            goto L54
        L36:
            r3 = 0
            r4 = 0
        L38:
            if (r3 >= r0) goto L54
            java.lang.String[] r8 = android.support.v4.media.MediaMetadataCompat.f495c0
            int r9 = r8.length
            if (r4 >= r9) goto L54
            int r9 = r4 + 1
            r4 = r8[r4]
            java.lang.CharSequence r4 = r14.m232f(r4)
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 != 0) goto L52
            int r8 = r3 + 1
            r1[r3] = r4
            r3 = r8
        L52:
            r4 = r9
            goto L38
        L54:
            r0 = 0
        L55:
            java.lang.String[] r3 = android.support.v4.media.MediaMetadataCompat.f496d0
            int r4 = r3.length
            r8 = 0
            if (r0 >= r4) goto L68
            r3 = r3[r0]
            android.graphics.Bitmap r3 = r14.m228b(r3)
            if (r3 == 0) goto L65
            r0 = r3
            goto L69
        L65:
            int r0 = r0 + 1
            goto L55
        L68:
            r0 = r8
        L69:
            r3 = 0
        L6a:
            java.lang.String[] r4 = android.support.v4.media.MediaMetadataCompat.f497e0
            int r9 = r4.length
            if (r3 >= r9) goto L84
            r4 = r4[r3]
            java.lang.String r4 = r14.m231e(r4)
            boolean r9 = android.text.TextUtils.isEmpty(r4)
            if (r9 != 0) goto L81
            android.net.Uri r3 = android.net.Uri.parse(r4)
            r9 = r3
            goto L85
        L81:
            int r3 = r3 + 1
            goto L6a
        L84:
            r9 = r8
        L85:
            java.lang.String r3 = "android.media.metadata.MEDIA_URI"
            java.lang.String r3 = r14.m231e(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L97
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r10 = r3
            goto L98
        L97:
            r10 = r8
        L98:
            r3 = r1[r6]
            r4 = r1[r7]
            r5 = r1[r5]
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            android.os.Bundle r6 = r14.f498Y
            java.lang.String r7 = "android.media.metadata.BT_FOLDER_TYPE"
            boolean r6 = r6.containsKey(r7)
            r11 = 0
            if (r6 == 0) goto Lba
            android.os.Bundle r6 = r14.f498Y
            long r6 = r6.getLong(r7, r11)
            java.lang.String r13 = "android.media.extra.BT_FOLDER_TYPE"
            r1.putLong(r13, r6)
        Lba:
            android.os.Bundle r6 = r14.f498Y
            java.lang.String r7 = "android.media.metadata.DOWNLOAD_STATUS"
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto Lcf
            android.os.Bundle r6 = r14.f498Y
            long r6 = r6.getLong(r7, r11)
            java.lang.String r11 = "android.media.extra.DOWNLOAD_STATUS"
            r1.putLong(r11, r6)
        Lcf:
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto Ld6
            r8 = r1
        Ld6:
            android.support.v4.media.MediaDescriptionCompat r11 = new android.support.v4.media.MediaDescriptionCompat
            r1 = r11
            r6 = r0
            r7 = r9
            r9 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r14.f500a0 = r11
            return r11
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: e */
    public java.lang.String m231e(java.lang.String r2) {
            r1 = this;
            android.os.Bundle r0 = r1.f498Y
            java.lang.CharSequence r2 = r0.getCharSequence(r2)
            if (r2 == 0) goto Ld
            java.lang.String r2 = r2.toString()
            return r2
        Ld:
            r2 = 0
            return r2
    }

    /* renamed from: f */
    public java.lang.CharSequence m232f(java.lang.String r2) {
            r1 = this;
            android.os.Bundle r0 = r1.f498Y
            java.lang.CharSequence r2 = r0.getCharSequence(r2)
            return r2
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            android.os.Bundle r2 = r0.f498Y
            r1.writeBundle(r2)
            return
    }
}
