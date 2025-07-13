package p089f5;

/* renamed from: f5.d */
/* loaded from: classes.dex */
public final class C2062d extends p089f5.AbstractC2060b {
    public static final android.os.Parcelable.Creator<p089f5.C2062d> CREATOR = null;

    /* renamed from: Y */
    public final long f9434Y;

    /* renamed from: Z */
    public final boolean f9435Z;

    /* renamed from: a0 */
    public final boolean f9436a0;

    /* renamed from: b0 */
    public final boolean f9437b0;

    /* renamed from: c0 */
    public final boolean f9438c0;

    /* renamed from: d0 */
    public final long f9439d0;

    /* renamed from: e0 */
    public final long f9440e0;

    /* renamed from: f0 */
    public final java.util.List<p089f5.C2062d.b> f9441f0;

    /* renamed from: g0 */
    public final boolean f9442g0;

    /* renamed from: h0 */
    public final long f9443h0;

    /* renamed from: i0 */
    public final int f9444i0;

    /* renamed from: j0 */
    public final int f9445j0;

    /* renamed from: k0 */
    public final int f9446k0;

    /* renamed from: f5.d$a */
    public class a implements android.os.Parcelable.Creator<p089f5.C2062d> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p089f5.C2062d createFromParcel(android.os.Parcel r3) {
                r2 = this;
                f5.d r0 = new f5.d
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p089f5.C2062d[] newArray(int r1) {
                r0 = this;
                f5.d[] r1 = new p089f5.C2062d[r1]
                return r1
        }
    }

    /* renamed from: f5.d$b */
    public static final class b {

        /* renamed from: a */
        public final int f9447a;

        /* renamed from: b */
        public final long f9448b;

        /* renamed from: c */
        public final long f9449c;

        public b(int r1, long r2, long r4) {
                r0 = this;
                r0.<init>()
                r0.f9447a = r1
                r0.f9448b = r2
                r0.f9449c = r4
                return
        }

        public b(int r1, long r2, long r4, p089f5.C2062d.a r6) {
                r0 = this;
                r0.<init>()
                r0.f9447a = r1
                r0.f9448b = r2
                r0.f9449c = r4
                return
        }
    }

    static {
            f5.d$a r0 = new f5.d$a
            r0.<init>()
            p089f5.C2062d.CREATOR = r0
            return
    }

    public C2062d(long r4, boolean r6, boolean r7, boolean r8, boolean r9, long r10, long r12, java.util.List<p089f5.C2062d.b> r14, boolean r15, long r16, int r18, int r19, int r20) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.f9434Y = r1
            r1 = r6
            r0.f9435Z = r1
            r1 = r7
            r0.f9436a0 = r1
            r1 = r8
            r0.f9437b0 = r1
            r1 = r9
            r0.f9438c0 = r1
            r1 = r10
            r0.f9439d0 = r1
            r1 = r12
            r0.f9440e0 = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r14)
            r0.f9441f0 = r1
            r1 = r15
            r0.f9442g0 = r1
            r1 = r16
            r0.f9443h0 = r1
            r1 = r18
            r0.f9444i0 = r1
            r1 = r19
            r0.f9445j0 = r1
            r1 = r20
            r0.f9446k0 = r1
            return
    }

    public C2062d(android.os.Parcel r12, p089f5.C2062d.a r13) {
            r11 = this;
            r11.<init>()
            long r0 = r12.readLong()
            r11.f9434Y = r0
            byte r13 = r12.readByte()
            r0 = 0
            r1 = 1
            if (r13 != r1) goto L13
            r13 = 1
            goto L14
        L13:
            r13 = 0
        L14:
            r11.f9435Z = r13
            byte r13 = r12.readByte()
            if (r13 != r1) goto L1e
            r13 = 1
            goto L1f
        L1e:
            r13 = 0
        L1f:
            r11.f9436a0 = r13
            byte r13 = r12.readByte()
            if (r13 != r1) goto L29
            r13 = 1
            goto L2a
        L29:
            r13 = 0
        L2a:
            r11.f9437b0 = r13
            byte r13 = r12.readByte()
            if (r13 != r1) goto L34
            r13 = 1
            goto L35
        L34:
            r13 = 0
        L35:
            r11.f9438c0 = r13
            long r2 = r12.readLong()
            r11.f9439d0 = r2
            long r2 = r12.readLong()
            r11.f9440e0 = r2
            int r13 = r12.readInt()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r13)
            r3 = 0
        L4d:
            if (r3 >= r13) goto L67
            f5.d$b r10 = new f5.d$b
            int r5 = r12.readInt()
            long r6 = r12.readLong()
            long r8 = r12.readLong()
            r4 = r10
            r4.<init>(r5, r6, r8)
            r2.add(r10)
            int r3 = r3 + 1
            goto L4d
        L67:
            java.util.List r13 = java.util.Collections.unmodifiableList(r2)
            r11.f9441f0 = r13
            byte r13 = r12.readByte()
            if (r13 != r1) goto L74
            r0 = 1
        L74:
            r11.f9442g0 = r0
            long r0 = r12.readLong()
            r11.f9443h0 = r0
            int r13 = r12.readInt()
            r11.f9444i0 = r13
            int r13 = r12.readInt()
            r11.f9445j0 = r13
            int r12 = r12.readInt()
            r11.f9446k0 = r12
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            long r0 = r4.f9434Y
            r5.writeLong(r0)
            boolean r6 = r4.f9435Z
            byte r6 = (byte) r6
            r5.writeByte(r6)
            boolean r6 = r4.f9436a0
            byte r6 = (byte) r6
            r5.writeByte(r6)
            boolean r6 = r4.f9437b0
            byte r6 = (byte) r6
            r5.writeByte(r6)
            boolean r6 = r4.f9438c0
            byte r6 = (byte) r6
            r5.writeByte(r6)
            long r0 = r4.f9439d0
            r5.writeLong(r0)
            long r0 = r4.f9440e0
            r5.writeLong(r0)
            java.util.List<f5.d$b> r6 = r4.f9441f0
            int r6 = r6.size()
            r5.writeInt(r6)
            r0 = 0
        L31:
            if (r0 >= r6) goto L4d
            java.util.List<f5.d$b> r1 = r4.f9441f0
            java.lang.Object r1 = r1.get(r0)
            f5.d$b r1 = (p089f5.C2062d.b) r1
            int r2 = r1.f9447a
            r5.writeInt(r2)
            long r2 = r1.f9448b
            r5.writeLong(r2)
            long r1 = r1.f9449c
            r5.writeLong(r1)
            int r0 = r0 + 1
            goto L31
        L4d:
            boolean r6 = r4.f9442g0
            byte r6 = (byte) r6
            r5.writeByte(r6)
            long r0 = r4.f9443h0
            r5.writeLong(r0)
            int r6 = r4.f9444i0
            r5.writeInt(r6)
            int r6 = r4.f9445j0
            r5.writeInt(r6)
            int r6 = r4.f9446k0
            r5.writeInt(r6)
            return
    }
}
