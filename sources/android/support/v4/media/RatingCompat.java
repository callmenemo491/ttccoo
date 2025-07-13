package android.support.v4.media;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.RatingCompat> CREATOR = null;

    /* renamed from: Y */
    public final int f502Y;

    /* renamed from: Z */
    public final float f503Z;

    /* renamed from: a0 */
    public java.lang.Object f504a0;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    public class C0140a implements android.os.Parcelable.Creator<android.support.v4.media.RatingCompat> {
        public C0140a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public android.support.v4.media.RatingCompat createFromParcel(android.os.Parcel r3) {
                r2 = this;
                android.support.v4.media.RatingCompat r0 = new android.support.v4.media.RatingCompat
                int r1 = r3.readInt()
                float r3 = r3.readFloat()
                r0.<init>(r1, r3)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public android.support.v4.media.RatingCompat[] newArray(int r1) {
                r0 = this;
                android.support.v4.media.RatingCompat[] r1 = new android.support.v4.media.RatingCompat[r1]
                return r1
        }
    }

    /* renamed from: android.support.v4.media.RatingCompat$b */
    public static class C0141b {
        /* renamed from: a */
        public static float m243a(android.media.Rating r0) {
                float r0 = r0.getPercentRating()
                return r0
        }

        /* renamed from: b */
        public static int m244b(android.media.Rating r0) {
                int r0 = r0.getRatingStyle()
                return r0
        }

        /* renamed from: c */
        public static float m245c(android.media.Rating r0) {
                float r0 = r0.getStarRating()
                return r0
        }

        /* renamed from: d */
        public static boolean m246d(android.media.Rating r0) {
                boolean r0 = r0.hasHeart()
                return r0
        }

        /* renamed from: e */
        public static boolean m247e(android.media.Rating r0) {
                boolean r0 = r0.isRated()
                return r0
        }

        /* renamed from: f */
        public static boolean m248f(android.media.Rating r0) {
                boolean r0 = r0.isThumbUp()
                return r0
        }

        /* renamed from: g */
        public static android.media.Rating m249g(boolean r0) {
                android.media.Rating r0 = android.media.Rating.newHeartRating(r0)
                return r0
        }

        /* renamed from: h */
        public static android.media.Rating m250h(float r0) {
                android.media.Rating r0 = android.media.Rating.newPercentageRating(r0)
                return r0
        }

        /* renamed from: i */
        public static android.media.Rating m251i(int r0, float r1) {
                android.media.Rating r0 = android.media.Rating.newStarRating(r0, r1)
                return r0
        }

        /* renamed from: j */
        public static android.media.Rating m252j(boolean r0) {
                android.media.Rating r0 = android.media.Rating.newThumbRating(r0)
                return r0
        }

        /* renamed from: k */
        public static android.media.Rating m253k(int r0) {
                android.media.Rating r0 = android.media.Rating.newUnratedRating(r0)
                return r0
        }
    }

    static {
            android.support.v4.media.RatingCompat$a r0 = new android.support.v4.media.RatingCompat$a
            r0.<init>()
            android.support.v4.media.RatingCompat.CREATOR = r0
            return
    }

    public RatingCompat(int r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f502Y = r1
            r0.f503Z = r2
            return
    }

    /* renamed from: a */
    public static android.support.v4.media.RatingCompat m237a(java.lang.Object r6) {
            r0 = 0
            if (r6 == 0) goto L95
            r1 = r6
            android.media.Rating r1 = (android.media.Rating) r1
            int r2 = android.support.v4.media.RatingCompat.C0141b.m244b(r1)
            boolean r3 = android.support.v4.media.RatingCompat.C0141b.m247e(r1)
            if (r3 == 0) goto L88
            java.lang.String r3 = "Rating"
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            switch(r2) {
                case 1: goto L78;
                case 2: goto L69;
                case 3: goto L36;
                case 4: goto L36;
                case 5: goto L36;
                case 6: goto L19;
                default: goto L18;
            }
        L18:
            return r0
        L19:
            float r1 = android.support.v4.media.RatingCompat.C0141b.m243a(r1)
            int r2 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r2 < 0) goto L30
            r2 = 1120403456(0x42c80000, float:100.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L28
            goto L30
        L28:
            android.support.v4.media.RatingCompat r0 = new android.support.v4.media.RatingCompat
            r2 = 6
            r0.<init>(r2, r1)
            goto L93
        L30:
            java.lang.String r1 = "Invalid percentage-based rating value"
            android.util.Log.e(r3, r1)
            goto L93
        L36:
            float r1 = android.support.v4.media.RatingCompat.C0141b.m245c(r1)
            r4 = 3
            if (r2 == r4) goto L52
            r4 = 4
            if (r2 == r4) goto L4f
            r4 = 5
            if (r2 == r4) goto L4c
            java.lang.String r1 = "Invalid rating style ("
            java.lang.String r4 = ") for a star rating"
            java.lang.String r1 = android.support.v4.media.C0146e.m258a(r1, r2, r4)
            goto L65
        L4c:
            r4 = 1084227584(0x40a00000, float:5.0)
            goto L54
        L4f:
            r4 = 1082130432(0x40800000, float:4.0)
            goto L54
        L52:
            r4 = 1077936128(0x40400000, float:3.0)
        L54:
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 < 0) goto L63
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L5d
            goto L63
        L5d:
            android.support.v4.media.RatingCompat r0 = new android.support.v4.media.RatingCompat
            r0.<init>(r2, r1)
            goto L93
        L63:
            java.lang.String r1 = "Trying to set out of range star-based rating"
        L65:
            android.util.Log.e(r3, r1)
            goto L93
        L69:
            boolean r0 = android.support.v4.media.RatingCompat.C0141b.m248f(r1)
            android.support.v4.media.RatingCompat r1 = new android.support.v4.media.RatingCompat
            if (r0 == 0) goto L72
            goto L73
        L72:
            r4 = 0
        L73:
            r0 = 2
            r1.<init>(r0, r4)
            goto L86
        L78:
            boolean r0 = android.support.v4.media.RatingCompat.C0141b.m246d(r1)
            android.support.v4.media.RatingCompat r1 = new android.support.v4.media.RatingCompat
            if (r0 == 0) goto L81
            goto L82
        L81:
            r4 = 0
        L82:
            r0 = 1
            r1.<init>(r0, r4)
        L86:
            r0 = r1
            goto L93
        L88:
            switch(r2) {
                case 1: goto L8c;
                case 2: goto L8c;
                case 3: goto L8c;
                case 4: goto L8c;
                case 5: goto L8c;
                case 6: goto L8c;
                default: goto L8b;
            }
        L8b:
            goto L93
        L8c:
            android.support.v4.media.RatingCompat r0 = new android.support.v4.media.RatingCompat
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.<init>(r2, r1)
        L93:
            r0.f504a0 = r6
        L95:
            return r0
    }

    /* renamed from: b */
    public float m238b() {
            r2 = this;
            int r0 = r2.f502Y
            r1 = 6
            if (r0 != r1) goto Lf
            boolean r0 = r2.m241e()
            if (r0 != 0) goto Lc
            goto Lf
        Lc:
            float r0 = r2.f503Z
            return r0
        Lf:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r0
    }

    /* renamed from: c */
    public float m239c() {
            r2 = this;
            int r0 = r2.f502Y
            r1 = 3
            if (r0 == r1) goto Lc
            r1 = 4
            if (r0 == r1) goto Lc
            r1 = 5
            if (r0 == r1) goto Lc
            goto L15
        Lc:
            boolean r0 = r2.m241e()
            if (r0 == 0) goto L15
            float r0 = r2.f503Z
            return r0
        L15:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r0
    }

    /* renamed from: d */
    public boolean m240d() {
            r4 = this;
            int r0 = r4.f502Y
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L7
            return r1
        L7:
            float r0 = r4.f503Z
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L10
            r1 = 1
        L10:
            return r1
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            int r0 = r1.f502Y
            return r0
    }

    /* renamed from: e */
    public boolean m241e() {
            r2 = this;
            float r0 = r2.f503Z
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    /* renamed from: f */
    public boolean m242f() {
            r3 = this;
            int r0 = r3.f502Y
            r1 = 0
            r2 = 2
            if (r0 == r2) goto L7
            return r1
        L7:
            float r0 = r3.f503Z
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L10
            r1 = 1
        L10:
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Rating:style="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.f502Y
            r0.append(r1)
            java.lang.String r1 = " rating="
            r0.append(r1)
            float r1 = r3.f503Z
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L1a
            java.lang.String r1 = "unrated"
            goto L1e
        L1a:
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L1e:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.f502Y
            r1.writeInt(r2)
            float r2 = r0.f503Z
            r1.writeFloat(r2)
            return
    }
}
