package p070e5;

/* renamed from: e5.c */
/* loaded from: classes.dex */
public final class C1518c implements p427y4.C7110a.b {
    public static final android.os.Parcelable.Creator<p070e5.C1518c> CREATOR = null;

    /* renamed from: Y */
    public final java.util.List<p070e5.C1518c.b> f7373Y;

    /* renamed from: e5.c$a */
    public class a implements android.os.Parcelable.Creator<p070e5.C1518c> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p070e5.C1518c createFromParcel(android.os.Parcel r3) {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.lang.Class<e5.c$b> r1 = p070e5.C1518c.b.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                r3.readList(r0, r1)
                e5.c r3 = new e5.c
                r3.<init>(r0)
                return r3
        }

        @Override // android.os.Parcelable.Creator
        public p070e5.C1518c[] newArray(int r1) {
                r0 = this;
                e5.c[] r1 = new p070e5.C1518c[r1]
                return r1
        }
    }

    /* renamed from: e5.c$b */
    public static final class b implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<p070e5.C1518c.b> CREATOR = null;

        /* renamed from: Y */
        public final long f7374Y;

        /* renamed from: Z */
        public final long f7375Z;

        /* renamed from: a0 */
        public final int f7376a0;

        /* renamed from: e5.c$b$a */
        public class a implements android.os.Parcelable.Creator<p070e5.C1518c.b> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public p070e5.C1518c.b createFromParcel(android.os.Parcel r7) {
                    r6 = this;
                    long r1 = r7.readLong()
                    long r3 = r7.readLong()
                    int r5 = r7.readInt()
                    e5.c$b r7 = new e5.c$b
                    r0 = r7
                    r0.<init>(r1, r3, r5)
                    return r7
            }

            @Override // android.os.Parcelable.Creator
            public p070e5.C1518c.b[] newArray(int r1) {
                    r0 = this;
                    e5.c$b[] r1 = new p070e5.C1518c.b[r1]
                    return r1
            }
        }

        static {
                e5.c$b$a r0 = new e5.c$b$a
                r0.<init>()
                p070e5.C1518c.b.CREATOR = r0
                return
        }

        public b(long r2, long r4, int r6) {
                r1 = this;
                r1.<init>()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 >= 0) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                p371v5.C6549a.m13288b(r0)
                r1.f7374Y = r2
                r1.f7375Z = r4
                r1.f7376a0 = r6
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L2b
                java.lang.Class<e5.c$b> r2 = p070e5.C1518c.b.class
                java.lang.Class r3 = r8.getClass()
                if (r2 == r3) goto L10
                goto L2b
            L10:
                e5.c$b r8 = (p070e5.C1518c.b) r8
                long r2 = r7.f7374Y
                long r4 = r8.f7374Y
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L29
                long r2 = r7.f7375Z
                long r4 = r8.f7375Z
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L29
                int r2 = r7.f7376a0
                int r8 = r8.f7376a0
                if (r2 != r8) goto L29
                goto L2a
            L29:
                r0 = 0
            L2a:
                return r0
            L2b:
                return r1
        }

        public int hashCode() {
                r3 = this;
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                long r1 = r3.f7374Y
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                long r1 = r3.f7375Z
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                int r1 = r3.f7376a0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 2
                r0[r2] = r1
                int r0 = java.util.Arrays.hashCode(r0)
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                long r1 = r3.f7374Y
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                long r1 = r3.f7375Z
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                int r1 = r3.f7376a0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 2
                r0[r2] = r1
                java.lang.String r1 = "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d"
                java.lang.String r0 = p371v5.C6552b0.m13318k(r1, r0)
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r3, int r4) {
                r2 = this;
                long r0 = r2.f7374Y
                r3.writeLong(r0)
                long r0 = r2.f7375Z
                r3.writeLong(r0)
                int r4 = r2.f7376a0
                r3.writeInt(r4)
                return
        }
    }

    static {
            e5.c$a r0 = new e5.c$a
            r0.<init>()
            p070e5.C1518c.CREATOR = r0
            return
    }

    public C1518c(java.util.List<p070e5.C1518c.b> r9) {
            r8 = this;
            r8.<init>()
            r8.f7373Y = r9
            boolean r0 = r9.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            goto L36
        Le:
            java.lang.Object r0 = r9.get(r2)
            e5.c$b r0 = (p070e5.C1518c.b) r0
            long r3 = r0.f7375Z
            r0 = 1
        L17:
            int r5 = r9.size()
            if (r0 >= r5) goto L36
            java.lang.Object r5 = r9.get(r0)
            e5.c$b r5 = (p070e5.C1518c.b) r5
            long r5 = r5.f7374Y
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L2b
            r2 = 1
            goto L36
        L2b:
            java.lang.Object r3 = r9.get(r0)
            e5.c$b r3 = (p070e5.C1518c.b) r3
            long r3 = r3.f7375Z
            int r0 = r0 + 1
            goto L17
        L36:
            r9 = r2 ^ 1
            p371v5.C6549a.m13288b(r9)
            return
    }

    @Override // p427y4.C7110a.b
    /* renamed from: D */
    public /* synthetic */ p088f4.C2003e0 mo30D() {
            r1 = this;
            f4.e0 r0 = p427y4.C7111b.m14222b(r1)
            return r0
    }

    @Override // p427y4.C7110a.b
    /* renamed from: O */
    public /* synthetic */ byte[] mo31O() {
            r1 = this;
            byte[] r0 = p427y4.C7111b.m14221a(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<e5.c> r0 = p070e5.C1518c.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            e5.c r3 = (p070e5.C1518c) r3
            java.util.List<e5.c$b> r0 = r2.f7373Y
            java.util.List<e5.c$b> r3 = r3.f7373Y
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r1 = this;
            java.util.List<e5.c$b> r0 = r1.f7373Y
            int r0 = r0.hashCode()
            return r0
    }

    @Override // p427y4.C7110a.b
    /* renamed from: p */
    public /* synthetic */ void mo32p(p088f4.C2021k0.b r1) {
            r0 = this;
            p427y4.C7111b.m14223c(r0, r1)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.util.List<e5.c$b> r0 = r3.f7373Y
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            int r1 = r1 + 21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "SlowMotion: segments="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.util.List<e5.c$b> r2 = r0.f7373Y
            r1.writeList(r2)
            return
    }
}
