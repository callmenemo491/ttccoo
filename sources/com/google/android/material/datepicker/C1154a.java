package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: classes.dex */
public final class C1154a implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.C1154a> CREATOR = null;

    /* renamed from: Y */
    public final com.google.android.material.datepicker.C1173r f6041Y;

    /* renamed from: Z */
    public final com.google.android.material.datepicker.C1173r f6042Z;

    /* renamed from: a0 */
    public final com.google.android.material.datepicker.C1154a.c f6043a0;

    /* renamed from: b0 */
    public com.google.android.material.datepicker.C1173r f6044b0;

    /* renamed from: c0 */
    public final int f6045c0;

    /* renamed from: d0 */
    public final int f6046d0;

    /* renamed from: com.google.android.material.datepicker.a$a */
    public static class a implements android.os.Parcelable.Creator<com.google.android.material.datepicker.C1154a> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.C1154a createFromParcel(android.os.Parcel r8) {
                r7 = this;
                java.lang.Class<com.google.android.material.datepicker.r> r0 = com.google.android.material.datepicker.C1173r.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r8.readParcelable(r0)
                r2 = r0
                com.google.android.material.datepicker.r r2 = (com.google.android.material.datepicker.C1173r) r2
                java.lang.Class<com.google.android.material.datepicker.r> r0 = com.google.android.material.datepicker.C1173r.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r8.readParcelable(r0)
                r3 = r0
                com.google.android.material.datepicker.r r3 = (com.google.android.material.datepicker.C1173r) r3
                java.lang.Class<com.google.android.material.datepicker.r> r0 = com.google.android.material.datepicker.C1173r.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r8.readParcelable(r0)
                r5 = r0
                com.google.android.material.datepicker.r r5 = (com.google.android.material.datepicker.C1173r) r5
                java.lang.Class<com.google.android.material.datepicker.a$c> r0 = com.google.android.material.datepicker.C1154a.c.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r8 = r8.readParcelable(r0)
                r4 = r8
                com.google.android.material.datepicker.a$c r4 = (com.google.android.material.datepicker.C1154a.c) r4
                com.google.android.material.datepicker.a r8 = new com.google.android.material.datepicker.a
                r6 = 0
                r1 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return r8
        }

        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.C1154a[] newArray(int r1) {
                r0 = this;
                com.google.android.material.datepicker.a[] r1 = new com.google.android.material.datepicker.C1154a[r1]
                return r1
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    public static final class b {

        /* renamed from: e */
        public static final long f6047e = 0;

        /* renamed from: f */
        public static final long f6048f = 0;

        /* renamed from: a */
        public long f6049a;

        /* renamed from: b */
        public long f6050b;

        /* renamed from: c */
        public java.lang.Long f6051c;

        /* renamed from: d */
        public com.google.android.material.datepicker.C1154a.c f6052d;

        static {
                r0 = 1900(0x76c, float:2.662E-42)
                r1 = 0
                com.google.android.material.datepicker.r r0 = com.google.android.material.datepicker.C1173r.m3425g(r0, r1)
                long r0 = r0.f6127d0
                long r0 = com.google.android.material.datepicker.C1181z.m3440a(r0)
                com.google.android.material.datepicker.C1154a.b.f6047e = r0
                r0 = 2100(0x834, float:2.943E-42)
                r1 = 11
                com.google.android.material.datepicker.r r0 = com.google.android.material.datepicker.C1173r.m3425g(r0, r1)
                long r0 = r0.f6127d0
                long r0 = com.google.android.material.datepicker.C1181z.m3440a(r0)
                com.google.android.material.datepicker.C1154a.b.f6048f = r0
                return
        }

        public b(com.google.android.material.datepicker.C1154a r4) {
                r3 = this;
                r3.<init>()
                long r0 = com.google.android.material.datepicker.C1154a.b.f6047e
                r3.f6049a = r0
                long r0 = com.google.android.material.datepicker.C1154a.b.f6048f
                r3.f6050b = r0
                com.google.android.material.datepicker.d r0 = new com.google.android.material.datepicker.d
                r1 = -9223372036854775808
                r0.<init>(r1)
                r3.f6052d = r0
                com.google.android.material.datepicker.r r0 = r4.f6041Y
                long r0 = r0.f6127d0
                r3.f6049a = r0
                com.google.android.material.datepicker.r r0 = r4.f6042Z
                long r0 = r0.f6127d0
                r3.f6050b = r0
                com.google.android.material.datepicker.r r0 = r4.f6044b0
                long r0 = r0.f6127d0
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r3.f6051c = r0
                com.google.android.material.datepicker.a$c r4 = r4.f6043a0
                r3.f6052d = r4
                return
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$c */
    public interface c extends android.os.Parcelable {
        /* renamed from: A */
        boolean mo3400A(long r1);
    }

    static {
            com.google.android.material.datepicker.a$a r0 = new com.google.android.material.datepicker.a$a
            r0.<init>()
            com.google.android.material.datepicker.C1154a.CREATOR = r0
            return
    }

    public C1154a(com.google.android.material.datepicker.C1173r r1, com.google.android.material.datepicker.C1173r r2, com.google.android.material.datepicker.C1154a.c r3, com.google.android.material.datepicker.C1173r r4, com.google.android.material.datepicker.C1154a.a r5) {
            r0 = this;
            r0.<init>()
            r0.f6041Y = r1
            r0.f6042Z = r2
            r0.f6044b0 = r4
            r0.f6043a0 = r3
            if (r4 == 0) goto L20
            java.util.Calendar r3 = r1.f6122Y
            java.util.Calendar r5 = r4.f6122Y
            int r3 = r3.compareTo(r5)
            if (r3 > 0) goto L18
            goto L20
        L18:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "start Month cannot be after current Month"
            r1.<init>(r2)
            throw r1
        L20:
            if (r4 == 0) goto L35
            java.util.Calendar r3 = r4.f6122Y
            java.util.Calendar r4 = r2.f6122Y
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L2d
            goto L35
        L2d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "current Month cannot be after end Month"
            r1.<init>(r2)
            throw r1
        L35:
            int r3 = r1.m3431r(r2)
            int r3 = r3 + 1
            r0.f6046d0 = r3
            int r2 = r2.f6124a0
            int r1 = r1.f6124a0
            int r2 = r2 - r1
            int r2 = r2 + 1
            r0.f6045c0 = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.material.datepicker.C1154a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.material.datepicker.a r5 = (com.google.android.material.datepicker.C1154a) r5
            com.google.android.material.datepicker.r r1 = r4.f6041Y
            com.google.android.material.datepicker.r r3 = r5.f6041Y
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L35
            com.google.android.material.datepicker.r r1 = r4.f6042Z
            com.google.android.material.datepicker.r r3 = r5.f6042Z
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L35
            com.google.android.material.datepicker.r r1 = r4.f6044b0
            com.google.android.material.datepicker.r r3 = r5.f6044b0
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L35
            com.google.android.material.datepicker.a$c r1 = r4.f6043a0
            com.google.android.material.datepicker.a$c r5 = r5.f6043a0
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L35
            goto L36
        L35:
            r0 = 0
        L36:
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.material.datepicker.r r1 = r3.f6041Y
            r2 = 0
            r0[r2] = r1
            com.google.android.material.datepicker.r r1 = r3.f6042Z
            r2 = 1
            r0[r2] = r1
            com.google.android.material.datepicker.r r1 = r3.f6044b0
            r2 = 2
            r0[r2] = r1
            com.google.android.material.datepicker.a$c r1 = r3.f6043a0
            r2 = 3
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            com.google.android.material.datepicker.r r3 = r1.f6041Y
            r0 = 0
            r2.writeParcelable(r3, r0)
            com.google.android.material.datepicker.r r3 = r1.f6042Z
            r2.writeParcelable(r3, r0)
            com.google.android.material.datepicker.r r3 = r1.f6044b0
            r2.writeParcelable(r3, r0)
            com.google.android.material.datepicker.a$c r3 = r1.f6043a0
            r2.writeParcelable(r3, r0)
            return
    }
}
