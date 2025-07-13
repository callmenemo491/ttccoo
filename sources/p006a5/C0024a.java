package p006a5;

/* renamed from: a5.a */
/* loaded from: classes.dex */
public final class C0024a implements p427y4.C7110a.b {
    public static final android.os.Parcelable.Creator<p006a5.C0024a> CREATOR = null;

    /* renamed from: e0 */
    public static final p088f4.C2003e0 f55e0 = null;

    /* renamed from: f0 */
    public static final p088f4.C2003e0 f56f0 = null;

    /* renamed from: Y */
    public final java.lang.String f57Y;

    /* renamed from: Z */
    public final java.lang.String f58Z;

    /* renamed from: a0 */
    public final long f59a0;

    /* renamed from: b0 */
    public final long f60b0;

    /* renamed from: c0 */
    public final byte[] f61c0;

    /* renamed from: d0 */
    public int f62d0;

    /* renamed from: a5.a$a */
    public class a implements android.os.Parcelable.Creator<p006a5.C0024a> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p006a5.C0024a createFromParcel(android.os.Parcel r2) {
                r1 = this;
                a5.a r0 = new a5.a
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p006a5.C0024a[] newArray(int r1) {
                r0 = this;
                a5.a[] r1 = new p006a5.C0024a[r1]
                return r1
        }
    }

    static {
            f4.e0$b r0 = new f4.e0$b
            r0.<init>()
            java.lang.String r1 = "application/id3"
            r0.f8927k = r1
            f4.e0 r0 = r0.m5193a()
            p006a5.C0024a.f55e0 = r0
            f4.e0$b r0 = new f4.e0$b
            r0.<init>()
            java.lang.String r1 = "application/x-scte35"
            r0.f8927k = r1
            f4.e0 r0 = r0.m5193a()
            p006a5.C0024a.f56f0 = r0
            a5.a$a r0 = new a5.a$a
            r0.<init>()
            p006a5.C0024a.CREATOR = r0
            return
    }

    public C0024a(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.readString()
            int r1 = p371v5.C6552b0.f25624a
            r2.f57Y = r0
            java.lang.String r0 = r3.readString()
            r2.f58Z = r0
            long r0 = r3.readLong()
            r2.f59a0 = r0
            long r0 = r3.readLong()
            r2.f60b0 = r0
            byte[] r3 = r3.createByteArray()
            r2.f61c0 = r3
            return
    }

    public C0024a(java.lang.String r1, java.lang.String r2, long r3, long r5, byte[] r7) {
            r0 = this;
            r0.<init>()
            r0.f57Y = r1
            r0.f58Z = r2
            r0.f59a0 = r3
            r0.f60b0 = r5
            r0.f61c0 = r7
            return
    }

    @Override // p427y4.C7110a.b
    /* renamed from: D */
    public p088f4.C2003e0 mo30D() {
            r3 = this;
            java.lang.String r0 = r3.f57Y
            java.util.Objects.requireNonNull(r0)
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -1468477611: goto L24;
                case -795945609: goto L19;
                case 1303648457: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L2e
        Le:
            java.lang.String r1 = "https://developer.apple.com/streaming/emsg-id3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            goto L2e
        L17:
            r2 = 2
            goto L2e
        L19:
            java.lang.String r1 = "https://aomedia.org/emsg/ID3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22
            goto L2e
        L22:
            r2 = 1
            goto L2e
        L24:
            java.lang.String r1 = "urn:scte:scte35:2014:bin"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L2e
        L2d:
            r2 = 0
        L2e:
            switch(r2) {
                case 0: goto L36;
                case 1: goto L33;
                case 2: goto L33;
                default: goto L31;
            }
        L31:
            r0 = 0
            return r0
        L33:
            f4.e0 r0 = p006a5.C0024a.f55e0
            return r0
        L36:
            f4.e0 r0 = p006a5.C0024a.f56f0
            return r0
    }

    @Override // p427y4.C7110a.b
    /* renamed from: O */
    public byte[] mo31O() {
            r1 = this;
            f4.e0 r0 = r1.mo30D()
            if (r0 == 0) goto L9
            byte[] r0 = r1.f61c0
            goto La
        L9:
            r0 = 0
        La:
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
            if (r8 == 0) goto L43
            java.lang.Class<a5.a> r2 = p006a5.C0024a.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L43
        L10:
            a5.a r8 = (p006a5.C0024a) r8
            long r2 = r7.f59a0
            long r4 = r8.f59a0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L41
            long r2 = r7.f60b0
            long r4 = r8.f60b0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L41
            java.lang.String r2 = r7.f57Y
            java.lang.String r3 = r8.f57Y
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L41
            java.lang.String r2 = r7.f58Z
            java.lang.String r3 = r8.f58Z
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L41
            byte[] r2 = r7.f61c0
            byte[] r8 = r8.f61c0
            boolean r8 = java.util.Arrays.equals(r2, r8)
            if (r8 == 0) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            return r0
        L43:
            return r1
    }

    public int hashCode() {
            r6 = this;
            int r0 = r6.f62d0
            if (r0 != 0) goto L3c
            r0 = 527(0x20f, float:7.38E-43)
            java.lang.String r1 = r6.f57Y
            r2 = 0
            if (r1 == 0) goto L10
            int r1 = r1.hashCode()
            goto L11
        L10:
            r1 = 0
        L11:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r6.f58Z
            if (r1 == 0) goto L1c
            int r2 = r1.hashCode()
        L1c:
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.f59a0
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.f60b0
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            byte[] r1 = r6.f61c0
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            r6.f62d0 = r1
        L3c:
            int r0 = r6.f62d0
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
            r8 = this;
            java.lang.String r0 = r8.f57Y
            long r1 = r8.f60b0
            long r3 = r8.f59a0
            java.lang.String r5 = r8.f58Z
            r6 = 79
            int r6 = p064e.C1489c.m4038a(r0, r6)
            int r6 = p064e.C1489c.m4038a(r5, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "EMSG: scheme="
            r7.append(r6)
            r7.append(r0)
            java.lang.String r0 = ", id="
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = ", durationMs="
            r7.append(r0)
            r7.append(r3)
            java.lang.String r0 = ", value="
            r7.append(r0)
            r7.append(r5)
            java.lang.String r0 = r7.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            java.lang.String r4 = r2.f57Y
            r3.writeString(r4)
            java.lang.String r4 = r2.f58Z
            r3.writeString(r4)
            long r0 = r2.f59a0
            r3.writeLong(r0)
            long r0 = r2.f60b0
            r3.writeLong(r0)
            byte[] r4 = r2.f61c0
            r3.writeByteArray(r4)
            return
    }
}
