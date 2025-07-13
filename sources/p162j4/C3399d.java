package p162j4;

/* renamed from: j4.d */
/* loaded from: classes.dex */
public final class C3399d implements java.util.Comparator<p162j4.C3399d.b>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p162j4.C3399d> CREATOR = null;

    /* renamed from: Y */
    public final p162j4.C3399d.b[] f14726Y;

    /* renamed from: Z */
    public int f14727Z;

    /* renamed from: a0 */
    public final java.lang.String f14728a0;

    /* renamed from: b0 */
    public final int f14729b0;

    /* renamed from: j4.d$a */
    public class a implements android.os.Parcelable.Creator<p162j4.C3399d> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p162j4.C3399d createFromParcel(android.os.Parcel r2) {
                r1 = this;
                j4.d r0 = new j4.d
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p162j4.C3399d[] newArray(int r1) {
                r0 = this;
                j4.d[] r1 = new p162j4.C3399d[r1]
                return r1
        }
    }

    /* renamed from: j4.d$b */
    public static final class b implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<p162j4.C3399d.b> CREATOR = null;

        /* renamed from: Y */
        public int f14730Y;

        /* renamed from: Z */
        public final java.util.UUID f14731Z;

        /* renamed from: a0 */
        public final java.lang.String f14732a0;

        /* renamed from: b0 */
        public final java.lang.String f14733b0;

        /* renamed from: c0 */
        public final byte[] f14734c0;

        /* renamed from: j4.d$b$a */
        public class a implements android.os.Parcelable.Creator<p162j4.C3399d.b> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public p162j4.C3399d.b createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    j4.d$b r0 = new j4.d$b
                    r0.<init>(r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public p162j4.C3399d.b[] newArray(int r1) {
                    r0 = this;
                    j4.d$b[] r1 = new p162j4.C3399d.b[r1]
                    return r1
            }
        }

        static {
                j4.d$b$a r0 = new j4.d$b$a
                r0.<init>()
                p162j4.C3399d.b.CREATOR = r0
                return
        }

        public b(android.os.Parcel r6) {
                r5 = this;
                r5.<init>()
                java.util.UUID r0 = new java.util.UUID
                long r1 = r6.readLong()
                long r3 = r6.readLong()
                r0.<init>(r1, r3)
                r5.f14731Z = r0
                java.lang.String r0 = r6.readString()
                r5.f14732a0 = r0
                java.lang.String r0 = r6.readString()
                int r1 = p371v5.C6552b0.f25624a
                r5.f14733b0 = r0
                byte[] r6 = r6.createByteArray()
                r5.f14734c0 = r6
                return
        }

        public b(java.util.UUID r1, java.lang.String r2, java.lang.String r3, byte[] r4) {
                r0 = this;
                r0.<init>()
                java.util.Objects.requireNonNull(r1)
                r0.f14731Z = r1
                r0.f14732a0 = r2
                java.util.Objects.requireNonNull(r3)
                r0.f14733b0 = r3
                r0.f14734c0 = r4
                return
        }

        public b(java.util.UUID r1, java.lang.String r2, byte[] r3) {
                r0 = this;
                r0.<init>()
                java.util.Objects.requireNonNull(r1)
                r0.f14731Z = r1
                r1 = 0
                r0.f14732a0 = r1
                r0.f14733b0 = r2
                r0.f14734c0 = r3
                return
        }

        /* renamed from: a */
        public boolean m7822a(java.util.UUID r3) {
                r2 = this;
                java.util.UUID r0 = p088f4.C2017j.f8964a
                java.util.UUID r1 = r2.f14731Z
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L15
                java.util.UUID r0 = r2.f14731Z
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L13
                goto L15
            L13:
                r3 = 0
                goto L16
            L15:
                r3 = 1
            L16:
                return r3
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof p162j4.C3399d.b
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                r0 = 1
                if (r5 != r4) goto La
                return r0
            La:
                j4.d$b r5 = (p162j4.C3399d.b) r5
                java.lang.String r2 = r4.f14732a0
                java.lang.String r3 = r5.f14732a0
                boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
                if (r2 == 0) goto L35
                java.lang.String r2 = r4.f14733b0
                java.lang.String r3 = r5.f14733b0
                boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
                if (r2 == 0) goto L35
                java.util.UUID r2 = r4.f14731Z
                java.util.UUID r3 = r5.f14731Z
                boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
                if (r2 == 0) goto L35
                byte[] r2 = r4.f14734c0
                byte[] r5 = r5.f14734c0
                boolean r5 = java.util.Arrays.equals(r2, r5)
                if (r5 == 0) goto L35
                r1 = 1
            L35:
                return r1
        }

        public int hashCode() {
                r3 = this;
                int r0 = r3.f14730Y
                if (r0 != 0) goto L2a
                java.util.UUID r0 = r3.f14731Z
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r3.f14732a0
                if (r1 != 0) goto L12
                r1 = 0
                goto L16
            L12:
                int r1 = r1.hashCode()
            L16:
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r3.f14733b0
                r2 = 31
                int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
                byte[] r1 = r3.f14734c0
                int r1 = java.util.Arrays.hashCode(r1)
                int r1 = r1 + r0
                r3.f14730Y = r1
            L2a:
                int r0 = r3.f14730Y
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r3, int r4) {
                r2 = this;
                java.util.UUID r4 = r2.f14731Z
                long r0 = r4.getMostSignificantBits()
                r3.writeLong(r0)
                java.util.UUID r4 = r2.f14731Z
                long r0 = r4.getLeastSignificantBits()
                r3.writeLong(r0)
                java.lang.String r4 = r2.f14732a0
                r3.writeString(r4)
                java.lang.String r4 = r2.f14733b0
                r3.writeString(r4)
                byte[] r4 = r2.f14734c0
                r3.writeByteArray(r4)
                return
        }
    }

    static {
            j4.d$a r0 = new j4.d$a
            r0.<init>()
            p162j4.C3399d.CREATOR = r0
            return
    }

    public C3399d(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.f14728a0 = r0
            android.os.Parcelable$Creator<j4.d$b> r0 = p162j4.C3399d.b.CREATOR
            java.lang.Object[] r2 = r2.createTypedArray(r0)
            j4.d$b[] r2 = (p162j4.C3399d.b[]) r2
            int r0 = p371v5.C6552b0.f25624a
            r1.f14726Y = r2
            int r2 = r2.length
            r1.f14729b0 = r2
            return
    }

    public C3399d(java.lang.String r1, boolean r2, p162j4.C3399d.b... r3) {
            r0 = this;
            r0.<init>()
            r0.f14728a0 = r1
            if (r2 == 0) goto Le
            java.lang.Object r1 = r3.clone()
            r3 = r1
            j4.d$b[] r3 = (p162j4.C3399d.b[]) r3
        Le:
            r0.f14726Y = r3
            int r1 = r3.length
            r0.f14729b0 = r1
            java.util.Arrays.sort(r3, r0)
            return
    }

    /* renamed from: a */
    public p162j4.C3399d m7821a(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = r3.f14728a0
            boolean r0 = p371v5.C6552b0.m13308a(r0, r4)
            if (r0 == 0) goto L9
            return r3
        L9:
            j4.d r0 = new j4.d
            r1 = 0
            j4.d$b[] r2 = r3.f14726Y
            r0.<init>(r4, r1, r2)
            return r0
    }

    @Override // java.util.Comparator
    public int compare(p162j4.C3399d.b r3, p162j4.C3399d.b r4) {
            r2 = this;
            j4.d$b r3 = (p162j4.C3399d.b) r3
            j4.d$b r4 = (p162j4.C3399d.b) r4
            java.util.UUID r0 = p088f4.C2017j.f8964a
            java.util.UUID r1 = r3.f14731Z
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1a
            java.util.UUID r3 = r4.f14731Z
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L18
            r3 = 0
            goto L22
        L18:
            r3 = 1
            goto L22
        L1a:
            java.util.UUID r3 = r3.f14731Z
            java.util.UUID r4 = r4.f14731Z
            int r3 = r3.compareTo(r4)
        L22:
            return r3
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class<j4.d> r2 = p162j4.C3399d.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L29
        L10:
            j4.d r5 = (p162j4.C3399d) r5
            java.lang.String r2 = r4.f14728a0
            java.lang.String r3 = r5.f14728a0
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L27
            j4.d$b[] r2 = r4.f14726Y
            j4.d$b[] r5 = r5.f14726Y
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        L29:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f14727Z
            if (r0 != 0) goto L19
            java.lang.String r0 = r2.f14728a0
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            int r0 = r0.hashCode()
        Le:
            int r0 = r0 * 31
            j4.d$b[] r1 = r2.f14726Y
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            r2.f14727Z = r0
        L19:
            int r0 = r2.f14727Z
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r3 = r1.f14728a0
            r2.writeString(r3)
            j4.d$b[] r3 = r1.f14726Y
            r0 = 0
            r2.writeTypedArray(r3, r0)
            return
    }
}
