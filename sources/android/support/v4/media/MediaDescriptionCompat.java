package android.support.v4.media;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.MediaDescriptionCompat> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f485Y;

    /* renamed from: Z */
    public final java.lang.CharSequence f486Z;

    /* renamed from: a0 */
    public final java.lang.CharSequence f487a0;

    /* renamed from: b0 */
    public final java.lang.CharSequence f488b0;

    /* renamed from: c0 */
    public final android.graphics.Bitmap f489c0;

    /* renamed from: d0 */
    public final android.net.Uri f490d0;

    /* renamed from: e0 */
    public final android.os.Bundle f491e0;

    /* renamed from: f0 */
    public final android.net.Uri f492f0;

    /* renamed from: g0 */
    public android.media.MediaDescription f493g0;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public class C0135a implements android.os.Parcelable.Creator<android.support.v4.media.MediaDescriptionCompat> {
        public C0135a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public android.support.v4.media.MediaDescriptionCompat createFromParcel(android.os.Parcel r2) {
                r1 = this;
                android.os.Parcelable$Creator r0 = android.media.MediaDescription.CREATOR
                java.lang.Object r2 = r0.createFromParcel(r2)
                android.support.v4.media.MediaDescriptionCompat r2 = android.support.v4.media.MediaDescriptionCompat.m207a(r2)
                return r2
        }

        @Override // android.os.Parcelable.Creator
        public android.support.v4.media.MediaDescriptionCompat[] newArray(int r1) {
                r0 = this;
                android.support.v4.media.MediaDescriptionCompat[] r1 = new android.support.v4.media.MediaDescriptionCompat[r1]
                return r1
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static class C0136b {
        /* renamed from: a */
        public static android.media.MediaDescription m209a(android.media.MediaDescription.Builder r0) {
                android.media.MediaDescription r0 = r0.build()
                return r0
        }

        /* renamed from: b */
        public static android.media.MediaDescription.Builder m210b() {
                android.media.MediaDescription$Builder r0 = new android.media.MediaDescription$Builder
                r0.<init>()
                return r0
        }

        /* renamed from: c */
        public static java.lang.CharSequence m211c(android.media.MediaDescription r0) {
                java.lang.CharSequence r0 = r0.getDescription()
                return r0
        }

        /* renamed from: d */
        public static android.os.Bundle m212d(android.media.MediaDescription r0) {
                android.os.Bundle r0 = r0.getExtras()
                return r0
        }

        /* renamed from: e */
        public static android.graphics.Bitmap m213e(android.media.MediaDescription r0) {
                android.graphics.Bitmap r0 = r0.getIconBitmap()
                return r0
        }

        /* renamed from: f */
        public static android.net.Uri m214f(android.media.MediaDescription r0) {
                android.net.Uri r0 = r0.getIconUri()
                return r0
        }

        /* renamed from: g */
        public static java.lang.String m215g(android.media.MediaDescription r0) {
                java.lang.String r0 = r0.getMediaId()
                return r0
        }

        /* renamed from: h */
        public static java.lang.CharSequence m216h(android.media.MediaDescription r0) {
                java.lang.CharSequence r0 = r0.getSubtitle()
                return r0
        }

        /* renamed from: i */
        public static java.lang.CharSequence m217i(android.media.MediaDescription r0) {
                java.lang.CharSequence r0 = r0.getTitle()
                return r0
        }

        /* renamed from: j */
        public static void m218j(android.media.MediaDescription.Builder r0, java.lang.CharSequence r1) {
                r0.setDescription(r1)
                return
        }

        /* renamed from: k */
        public static void m219k(android.media.MediaDescription.Builder r0, android.os.Bundle r1) {
                r0.setExtras(r1)
                return
        }

        /* renamed from: l */
        public static void m220l(android.media.MediaDescription.Builder r0, android.graphics.Bitmap r1) {
                r0.setIconBitmap(r1)
                return
        }

        /* renamed from: m */
        public static void m221m(android.media.MediaDescription.Builder r0, android.net.Uri r1) {
                r0.setIconUri(r1)
                return
        }

        /* renamed from: n */
        public static void m222n(android.media.MediaDescription.Builder r0, java.lang.String r1) {
                r0.setMediaId(r1)
                return
        }

        /* renamed from: o */
        public static void m223o(android.media.MediaDescription.Builder r0, java.lang.CharSequence r1) {
                r0.setSubtitle(r1)
                return
        }

        /* renamed from: p */
        public static void m224p(android.media.MediaDescription.Builder r0, java.lang.CharSequence r1) {
                r0.setTitle(r1)
                return
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$c */
    public static class C0137c {
        /* renamed from: a */
        public static android.net.Uri m225a(android.media.MediaDescription r0) {
                android.net.Uri r0 = r0.getMediaUri()
                return r0
        }

        /* renamed from: b */
        public static void m226b(android.media.MediaDescription.Builder r0, android.net.Uri r1) {
                r0.setMediaUri(r1)
                return
        }
    }

    static {
            android.support.v4.media.MediaDescriptionCompat$a r0 = new android.support.v4.media.MediaDescriptionCompat$a
            r0.<init>()
            android.support.v4.media.MediaDescriptionCompat.CREATOR = r0
            return
    }

    public MediaDescriptionCompat(java.lang.String r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, android.graphics.Bitmap r5, android.net.Uri r6, android.os.Bundle r7, android.net.Uri r8) {
            r0 = this;
            r0.<init>()
            r0.f485Y = r1
            r0.f486Z = r2
            r0.f487a0 = r3
            r0.f488b0 = r4
            r0.f489c0 = r5
            r0.f490d0 = r6
            r0.f491e0 = r7
            r0.f492f0 = r8
            return
    }

    /* renamed from: a */
    public static android.support.v4.media.MediaDescriptionCompat m207a(java.lang.Object r14) {
            r0 = 0
            if (r14 == 0) goto L63
            int r1 = android.os.Build.VERSION.SDK_INT
            android.media.MediaDescription r14 = (android.media.MediaDescription) r14
            java.lang.String r3 = android.support.v4.media.MediaDescriptionCompat.C0136b.m215g(r14)
            java.lang.CharSequence r4 = android.support.v4.media.MediaDescriptionCompat.C0136b.m217i(r14)
            java.lang.CharSequence r5 = android.support.v4.media.MediaDescriptionCompat.C0136b.m216h(r14)
            java.lang.CharSequence r6 = android.support.v4.media.MediaDescriptionCompat.C0136b.m211c(r14)
            android.graphics.Bitmap r7 = android.support.v4.media.MediaDescriptionCompat.C0136b.m213e(r14)
            android.net.Uri r8 = android.support.v4.media.MediaDescriptionCompat.C0136b.m214f(r14)
            android.os.Bundle r2 = android.support.v4.media.MediaDescriptionCompat.C0136b.m212d(r14)
            if (r2 == 0) goto L29
            android.os.Bundle r2 = android.support.v4.media.session.MediaSessionCompat.m285g(r2)
        L29:
            java.lang.String r9 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L34
            android.os.Parcelable r10 = r2.getParcelable(r9)
            android.net.Uri r10 = (android.net.Uri) r10
            goto L35
        L34:
            r10 = r0
        L35:
            if (r10 == 0) goto L4e
            java.lang.String r11 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r12 = r2.containsKey(r11)
            if (r12 == 0) goto L48
            int r12 = r2.size()
            r13 = 2
            if (r12 != r13) goto L48
            r9 = r0
            goto L4f
        L48:
            r2.remove(r9)
            r2.remove(r11)
        L4e:
            r9 = r2
        L4f:
            if (r10 == 0) goto L52
            goto L5b
        L52:
            r2 = 23
            if (r1 < r2) goto L5a
            android.net.Uri r0 = android.support.v4.media.MediaDescriptionCompat.C0137c.m225a(r14)
        L5a:
            r10 = r0
        L5b:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.f493g0 = r14
        L63:
            return r0
    }

    /* renamed from: b */
    public java.lang.Object m208b() {
            r6 = this;
            android.media.MediaDescription r0 = r6.f493g0
            if (r0 != 0) goto L61
            int r0 = android.os.Build.VERSION.SDK_INT
            android.media.MediaDescription$Builder r1 = android.support.v4.media.MediaDescriptionCompat.C0136b.m210b()
            java.lang.String r2 = r6.f485Y
            android.support.v4.media.MediaDescriptionCompat.C0136b.m222n(r1, r2)
            java.lang.CharSequence r2 = r6.f486Z
            android.support.v4.media.MediaDescriptionCompat.C0136b.m224p(r1, r2)
            java.lang.CharSequence r2 = r6.f487a0
            android.support.v4.media.MediaDescriptionCompat.C0136b.m223o(r1, r2)
            java.lang.CharSequence r2 = r6.f488b0
            android.support.v4.media.MediaDescriptionCompat.C0136b.m218j(r1, r2)
            android.graphics.Bitmap r2 = r6.f489c0
            android.support.v4.media.MediaDescriptionCompat.C0136b.m220l(r1, r2)
            android.net.Uri r2 = r6.f490d0
            android.support.v4.media.MediaDescriptionCompat.C0136b.m221m(r1, r2)
            r2 = 23
            if (r0 >= r2) goto L4f
            android.net.Uri r3 = r6.f492f0
            if (r3 == 0) goto L4f
            android.os.Bundle r3 = r6.f491e0
            if (r3 != 0) goto L40
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r4 = 1
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            r3.putBoolean(r5, r4)
            goto L47
        L40:
            android.os.Bundle r3 = new android.os.Bundle
            android.os.Bundle r4 = r6.f491e0
            r3.<init>(r4)
        L47:
            android.net.Uri r4 = r6.f492f0
            java.lang.String r5 = "android.support.v4.media.description.MEDIA_URI"
            r3.putParcelable(r5, r4)
            goto L51
        L4f:
            android.os.Bundle r3 = r6.f491e0
        L51:
            android.support.v4.media.MediaDescriptionCompat.C0136b.m219k(r1, r3)
            if (r0 < r2) goto L5b
            android.net.Uri r0 = r6.f492f0
            android.support.v4.media.MediaDescriptionCompat.C0137c.m226b(r1, r0)
        L5b:
            android.media.MediaDescription r0 = android.support.v4.media.MediaDescriptionCompat.C0136b.m209a(r1)
            r6.f493g0 = r0
        L61:
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.CharSequence r1 = r3.f486Z
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.CharSequence r2 = r3.f487a0
            r0.append(r2)
            r0.append(r1)
            java.lang.CharSequence r1 = r3.f488b0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.Object r0 = r1.m208b()
            android.media.MediaDescription r0 = (android.media.MediaDescription) r0
            r0.writeToParcel(r2, r3)
            return
    }
}
