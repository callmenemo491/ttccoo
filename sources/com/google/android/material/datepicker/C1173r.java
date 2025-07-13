package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.r */
/* loaded from: classes.dex */
public final class C1173r implements java.lang.Comparable<com.google.android.material.datepicker.C1173r>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.C1173r> CREATOR = null;

    /* renamed from: Y */
    public final java.util.Calendar f6122Y;

    /* renamed from: Z */
    public final int f6123Z;

    /* renamed from: a0 */
    public final int f6124a0;

    /* renamed from: b0 */
    public final int f6125b0;

    /* renamed from: c0 */
    public final int f6126c0;

    /* renamed from: d0 */
    public final long f6127d0;

    /* renamed from: e0 */
    public java.lang.String f6128e0;

    /* renamed from: com.google.android.material.datepicker.r$a */
    public static class a implements android.os.Parcelable.Creator<com.google.android.material.datepicker.C1173r> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.C1173r createFromParcel(android.os.Parcel r2) {
                r1 = this;
                int r0 = r2.readInt()
                int r2 = r2.readInt()
                com.google.android.material.datepicker.r r2 = com.google.android.material.datepicker.C1173r.m3425g(r0, r2)
                return r2
        }

        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.C1173r[] newArray(int r1) {
                r0 = this;
                com.google.android.material.datepicker.r[] r1 = new com.google.android.material.datepicker.C1173r[r1]
                return r1
        }
    }

    static {
            com.google.android.material.datepicker.r$a r0 = new com.google.android.material.datepicker.r$a
            r0.<init>()
            com.google.android.material.datepicker.C1173r.CREATOR = r0
            return
    }

    public C1173r(java.util.Calendar r4) {
            r3 = this;
            r3.<init>()
            r0 = 5
            r1 = 1
            r4.set(r0, r1)
            java.util.Calendar r4 = com.google.android.material.datepicker.C1181z.m3441b(r4)
            r3.f6122Y = r4
            r2 = 2
            int r2 = r4.get(r2)
            r3.f6123Z = r2
            int r1 = r4.get(r1)
            r3.f6124a0 = r1
            r1 = 7
            int r1 = r4.getMaximum(r1)
            r3.f6125b0 = r1
            int r0 = r4.getActualMaximum(r0)
            r3.f6126c0 = r0
            long r0 = r4.getTimeInMillis()
            r3.f6127d0 = r0
            return
    }

    /* renamed from: g */
    public static com.google.android.material.datepicker.C1173r m3425g(int r2, int r3) {
            java.util.Calendar r0 = com.google.android.material.datepicker.C1181z.m3444e()
            r1 = 1
            r0.set(r1, r2)
            r2 = 2
            r0.set(r2, r3)
            com.google.android.material.datepicker.r r2 = new com.google.android.material.datepicker.r
            r2.<init>(r0)
            return r2
    }

    /* renamed from: h */
    public static com.google.android.material.datepicker.C1173r m3426h(long r1) {
            java.util.Calendar r0 = com.google.android.material.datepicker.C1181z.m3444e()
            r0.setTimeInMillis(r1)
            com.google.android.material.datepicker.r r1 = new com.google.android.material.datepicker.r
            r1.<init>(r0)
            return r1
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.google.android.material.datepicker.C1173r r1) {
            r0 = this;
            com.google.android.material.datepicker.r r1 = (com.google.android.material.datepicker.C1173r) r1
            int r1 = r0.m3427e(r1)
            return r1
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: e */
    public int m3427e(com.google.android.material.datepicker.C1173r r2) {
            r1 = this;
            java.util.Calendar r0 = r1.f6122Y
            java.util.Calendar r2 = r2.f6122Y
            int r2 = r0.compareTo(r2)
            return r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.material.datepicker.C1173r
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.material.datepicker.r r5 = (com.google.android.material.datepicker.C1173r) r5
            int r1 = r4.f6123Z
            int r3 = r5.f6123Z
            if (r1 != r3) goto L19
            int r1 = r4.f6124a0
            int r5 = r5.f6124a0
            if (r1 != r5) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.f6123Z
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.f6124a0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    /* renamed from: k */
    public int m3428k() {
            r2 = this;
            java.util.Calendar r0 = r2.f6122Y
            r1 = 7
            int r0 = r0.get(r1)
            java.util.Calendar r1 = r2.f6122Y
            int r1 = r1.getFirstDayOfWeek()
            int r0 = r0 - r1
            if (r0 >= 0) goto L13
            int r1 = r2.f6125b0
            int r0 = r0 + r1
        L13:
            return r0
    }

    /* renamed from: l */
    public java.lang.String m3429l(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = r4.f6128e0
            if (r0 != 0) goto L1c
            java.util.Calendar r0 = r4.f6122Y
            long r0 = r0.getTimeInMillis()
            java.util.TimeZone r2 = java.util.TimeZone.getDefault()
            int r2 = r2.getOffset(r0)
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 36
            java.lang.String r5 = android.text.format.DateUtils.formatDateTime(r5, r0, r2)
            r4.f6128e0 = r5
        L1c:
            java.lang.String r5 = r4.f6128e0
            return r5
    }

    /* renamed from: o */
    public com.google.android.material.datepicker.C1173r m3430o(int r3) {
            r2 = this;
            java.util.Calendar r0 = r2.f6122Y
            java.util.Calendar r0 = com.google.android.material.datepicker.C1181z.m3441b(r0)
            r1 = 2
            r0.add(r1, r3)
            com.google.android.material.datepicker.r r3 = new com.google.android.material.datepicker.r
            r3.<init>(r0)
            return r3
    }

    /* renamed from: r */
    public int m3431r(com.google.android.material.datepicker.C1173r r3) {
            r2 = this;
            java.util.Calendar r0 = r2.f6122Y
            boolean r0 = r0 instanceof java.util.GregorianCalendar
            if (r0 == 0) goto L14
            int r0 = r3.f6124a0
            int r1 = r2.f6124a0
            int r0 = r0 - r1
            int r0 = r0 * 12
            int r3 = r3.f6123Z
            int r1 = r2.f6123Z
            int r3 = r3 - r1
            int r3 = r3 + r0
            return r3
        L14:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only Gregorian calendars are supported."
            r3.<init>(r0)
            throw r3
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.f6124a0
            r1.writeInt(r2)
            int r2 = r0.f6123Z
            r1.writeInt(r2)
            return
    }
}
