package p051d5;

/* renamed from: d5.d */
/* loaded from: classes.dex */
public final class C1285d extends p051d5.AbstractC1289h {
    public static final android.os.Parcelable.Creator<p051d5.C1285d> CREATOR = null;

    /* renamed from: Z */
    public final java.lang.String f6773Z;

    /* renamed from: a0 */
    public final boolean f6774a0;

    /* renamed from: b0 */
    public final boolean f6775b0;

    /* renamed from: c0 */
    public final java.lang.String[] f6776c0;

    /* renamed from: d0 */
    public final p051d5.AbstractC1289h[] f6777d0;

    /* renamed from: d5.d$a */
    public class a implements android.os.Parcelable.Creator<p051d5.C1285d> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1285d createFromParcel(android.os.Parcel r2) {
                r1 = this;
                d5.d r0 = new d5.d
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1285d[] newArray(int r1) {
                r0 = this;
                d5.d[] r1 = new p051d5.C1285d[r1]
                return r1
        }
    }

    static {
            d5.d$a r0 = new d5.d$a
            r0.<init>()
            p051d5.C1285d.CREATOR = r0
            return
    }

    public C1285d(android.os.Parcel r5) {
            r4 = this;
            java.lang.String r0 = "CTOC"
            r4.<init>(r0)
            java.lang.String r0 = r5.readString()
            int r1 = p371v5.C6552b0.f25624a
            r4.f6773Z = r0
            byte r0 = r5.readByte()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            r4.f6774a0 = r0
            byte r0 = r5.readByte()
            if (r0 == 0) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            r4.f6775b0 = r1
            java.lang.String[] r0 = r5.createStringArray()
            r4.f6776c0 = r0
            int r0 = r5.readInt()
            d5.h[] r1 = new p051d5.AbstractC1289h[r0]
            r4.f6777d0 = r1
        L32:
            if (r2 >= r0) goto L47
            d5.h[] r1 = r4.f6777d0
            java.lang.Class<d5.h> r3 = p051d5.AbstractC1289h.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            android.os.Parcelable r3 = r5.readParcelable(r3)
            d5.h r3 = (p051d5.AbstractC1289h) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L32
        L47:
            return
    }

    public C1285d(java.lang.String r2, boolean r3, boolean r4, java.lang.String[] r5, p051d5.AbstractC1289h[] r6) {
            r1 = this;
            java.lang.String r0 = "CTOC"
            r1.<init>(r0)
            r1.f6773Z = r2
            r1.f6774a0 = r3
            r1.f6775b0 = r4
            r1.f6776c0 = r5
            r1.f6777d0 = r6
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3f
            java.lang.Class<d5.d> r2 = p051d5.C1285d.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L3f
        L10:
            d5.d r5 = (p051d5.C1285d) r5
            boolean r2 = r4.f6774a0
            boolean r3 = r5.f6774a0
            if (r2 != r3) goto L3d
            boolean r2 = r4.f6775b0
            boolean r3 = r5.f6775b0
            if (r2 != r3) goto L3d
            java.lang.String r2 = r4.f6773Z
            java.lang.String r3 = r5.f6773Z
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L3d
            java.lang.String[] r2 = r4.f6776c0
            java.lang.String[] r3 = r5.f6776c0
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L3d
            d5.h[] r2 = r4.f6777d0
            d5.h[] r5 = r5.f6777d0
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L3d
            goto L3e
        L3d:
            r0 = 0
        L3e:
            return r0
        L3f:
            return r1
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.f6774a0
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r2.f6775b0
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.f6773Z
            if (r0 == 0) goto L15
            int r0 = r0.hashCode()
            goto L16
        L15:
            r0 = 0
        L16:
            int r1 = r1 + r0
            return r1
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            java.lang.String r6 = r4.f6773Z
            r5.writeString(r6)
            boolean r6 = r4.f6774a0
            byte r6 = (byte) r6
            r5.writeByte(r6)
            boolean r6 = r4.f6775b0
            byte r6 = (byte) r6
            r5.writeByte(r6)
            java.lang.String[] r6 = r4.f6776c0
            r5.writeStringArray(r6)
            d5.h[] r6 = r4.f6777d0
            int r6 = r6.length
            r5.writeInt(r6)
            d5.h[] r6 = r4.f6777d0
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L21:
            if (r2 >= r0) goto L2b
            r3 = r6[r2]
            r5.writeParcelable(r3, r1)
            int r2 = r2 + 1
            goto L21
        L2b:
            return
    }
}
