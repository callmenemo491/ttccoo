package p070e5;

/* renamed from: e5.b */
/* loaded from: classes.dex */
public final class C1517b implements p427y4.C7110a.b {
    public static final android.os.Parcelable.Creator<p070e5.C1517b> CREATOR = null;

    /* renamed from: Y */
    public final long f7368Y;

    /* renamed from: Z */
    public final long f7369Z;

    /* renamed from: a0 */
    public final long f7370a0;

    /* renamed from: b0 */
    public final long f7371b0;

    /* renamed from: c0 */
    public final long f7372c0;

    /* renamed from: e5.b$a */
    public class a implements android.os.Parcelable.Creator<p070e5.C1517b> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p070e5.C1517b createFromParcel(android.os.Parcel r3) {
                r2 = this;
                e5.b r0 = new e5.b
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p070e5.C1517b[] newArray(int r1) {
                r0 = this;
                e5.b[] r1 = new p070e5.C1517b[r1]
                return r1
        }
    }

    static {
            e5.b$a r0 = new e5.b$a
            r0.<init>()
            p070e5.C1517b.CREATOR = r0
            return
    }

    public C1517b(long r1, long r3, long r5, long r7, long r9) {
            r0 = this;
            r0.<init>()
            r0.f7368Y = r1
            r0.f7369Z = r3
            r0.f7370a0 = r5
            r0.f7371b0 = r7
            r0.f7372c0 = r9
            return
    }

    public C1517b(android.os.Parcel r3, p070e5.C1517b.a r4) {
            r2 = this;
            r2.<init>()
            long r0 = r3.readLong()
            r2.f7368Y = r0
            long r0 = r3.readLong()
            r2.f7369Z = r0
            long r0 = r3.readLong()
            r2.f7370a0 = r0
            long r0 = r3.readLong()
            r2.f7371b0 = r0
            long r3 = r3.readLong()
            r2.f7372c0 = r3
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

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L3d
            java.lang.Class<e5.b> r2 = p070e5.C1517b.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L3d
        L10:
            e5.b r8 = (p070e5.C1517b) r8
            long r2 = r7.f7368Y
            long r4 = r8.f7368Y
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L3b
            long r2 = r7.f7369Z
            long r4 = r8.f7369Z
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L3b
            long r2 = r7.f7370a0
            long r4 = r8.f7370a0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L3b
            long r2 = r7.f7371b0
            long r4 = r8.f7371b0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L3b
            long r2 = r7.f7372c0
            long r4 = r8.f7372c0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L3b
            goto L3c
        L3b:
            r0 = 0
        L3c:
            return r0
        L3d:
            return r1
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.f7368Y
            int r0 = p185k7.C3836i.m8624i(r0)
            int r0 = r0 + 527
            int r0 = r0 * 31
            long r1 = r4.f7369Z
            int r1 = p185k7.C3836i.m8624i(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.f7370a0
            int r0 = p185k7.C3836i.m8624i(r2)
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r4.f7371b0
            int r1 = p185k7.C3836i.m8624i(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.f7372c0
            int r0 = p185k7.C3836i.m8624i(r2)
            int r0 = r0 + r1
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
            r12 = this;
            long r0 = r12.f7368Y
            long r2 = r12.f7369Z
            long r4 = r12.f7370a0
            long r6 = r12.f7371b0
            long r8 = r12.f7372c0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = 218(0xda, float:3.05E-43)
            r10.<init>(r11)
            java.lang.String r11 = "Motion photo metadata: photoStartPosition="
            r10.append(r11)
            r10.append(r0)
            java.lang.String r0 = ", photoSize="
            r10.append(r0)
            r10.append(r2)
            java.lang.String r0 = ", photoPresentationTimestampUs="
            r10.append(r0)
            r10.append(r4)
            java.lang.String r0 = ", videoStartPosition="
            r10.append(r0)
            r10.append(r6)
            java.lang.String r0 = ", videoSize="
            r10.append(r0)
            r10.append(r8)
            java.lang.String r0 = r10.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            long r0 = r2.f7368Y
            r3.writeLong(r0)
            long r0 = r2.f7369Z
            r3.writeLong(r0)
            long r0 = r2.f7370a0
            r3.writeLong(r0)
            long r0 = r2.f7371b0
            r3.writeLong(r0)
            long r0 = r2.f7372c0
            r3.writeLong(r0)
            return
    }
}
