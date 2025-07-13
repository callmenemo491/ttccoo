package p089f5;

/* renamed from: f5.f */
/* loaded from: classes.dex */
public final class C2064f extends p089f5.AbstractC2060b {
    public static final android.os.Parcelable.Creator<p089f5.C2064f> CREATOR = null;

    /* renamed from: Y */
    public final java.util.List<p089f5.C2064f.c> f9450Y;

    /* renamed from: f5.f$a */
    public class a implements android.os.Parcelable.Creator<p089f5.C2064f> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p089f5.C2064f createFromParcel(android.os.Parcel r3) {
                r2 = this;
                f5.f r0 = new f5.f
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p089f5.C2064f[] newArray(int r1) {
                r0 = this;
                f5.f[] r1 = new p089f5.C2064f[r1]
                return r1
        }
    }

    /* renamed from: f5.f$b */
    public static final class b {

        /* renamed from: a */
        public final int f9451a;

        /* renamed from: b */
        public final long f9452b;

        public b(int r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.f9451a = r1
                r0.f9452b = r2
                return
        }

        public b(int r1, long r2, p089f5.C2064f.a r4) {
                r0 = this;
                r0.<init>()
                r0.f9451a = r1
                r0.f9452b = r2
                return
        }
    }

    /* renamed from: f5.f$c */
    public static final class c {

        /* renamed from: a */
        public final long f9453a;

        /* renamed from: b */
        public final boolean f9454b;

        /* renamed from: c */
        public final boolean f9455c;

        /* renamed from: d */
        public final boolean f9456d;

        /* renamed from: e */
        public final long f9457e;

        /* renamed from: f */
        public final java.util.List<p089f5.C2064f.b> f9458f;

        /* renamed from: g */
        public final boolean f9459g;

        /* renamed from: h */
        public final long f9460h;

        /* renamed from: i */
        public final int f9461i;

        /* renamed from: j */
        public final int f9462j;

        /* renamed from: k */
        public final int f9463k;

        public c(long r1, boolean r3, boolean r4, boolean r5, java.util.List<p089f5.C2064f.b> r6, long r7, boolean r9, long r10, int r12, int r13, int r14) {
                r0 = this;
                r0.<init>()
                r0.f9453a = r1
                r0.f9454b = r3
                r0.f9455c = r4
                r0.f9456d = r5
                java.util.List r1 = java.util.Collections.unmodifiableList(r6)
                r0.f9458f = r1
                r0.f9457e = r7
                r0.f9459g = r9
                r0.f9460h = r10
                r0.f9461i = r12
                r0.f9462j = r13
                r0.f9463k = r14
                return
        }

        public c(android.os.Parcel r10) {
                r9 = this;
                r9.<init>()
                long r0 = r10.readLong()
                r9.f9453a = r0
                byte r0 = r10.readByte()
                r1 = 0
                r2 = 1
                if (r0 != r2) goto L13
                r0 = 1
                goto L14
            L13:
                r0 = 0
            L14:
                r9.f9454b = r0
                byte r0 = r10.readByte()
                if (r0 != r2) goto L1e
                r0 = 1
                goto L1f
            L1e:
                r0 = 0
            L1f:
                r9.f9455c = r0
                byte r0 = r10.readByte()
                if (r0 != r2) goto L29
                r0 = 1
                goto L2a
            L29:
                r0 = 0
            L2a:
                r9.f9456d = r0
                int r0 = r10.readInt()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r0)
                r4 = 0
            L36:
                if (r4 >= r0) goto L4b
                f5.f$b r5 = new f5.f$b
                int r6 = r10.readInt()
                long r7 = r10.readLong()
                r5.<init>(r6, r7)
                r3.add(r5)
                int r4 = r4 + 1
                goto L36
            L4b:
                java.util.List r0 = java.util.Collections.unmodifiableList(r3)
                r9.f9458f = r0
                long r3 = r10.readLong()
                r9.f9457e = r3
                byte r0 = r10.readByte()
                if (r0 != r2) goto L5e
                r1 = 1
            L5e:
                r9.f9459g = r1
                long r0 = r10.readLong()
                r9.f9460h = r0
                int r0 = r10.readInt()
                r9.f9461i = r0
                int r0 = r10.readInt()
                r9.f9462j = r0
                int r10 = r10.readInt()
                r9.f9463k = r10
                return
        }
    }

    static {
            f5.f$a r0 = new f5.f$a
            r0.<init>()
            p089f5.C2064f.CREATOR = r0
            return
    }

    public C2064f(android.os.Parcel r4, p089f5.C2064f.a r5) {
            r3 = this;
            r3.<init>()
            int r5 = r4.readInt()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            r1 = 0
        Ld:
            if (r1 >= r5) goto L1a
            f5.f$c r2 = new f5.f$c
            r2.<init>(r4)
            r0.add(r2)
            int r1 = r1 + 1
            goto Ld
        L1a:
            java.util.List r4 = java.util.Collections.unmodifiableList(r0)
            r3.f9450Y = r4
            return
    }

    public C2064f(java.util.List<p089f5.C2064f.c> r1) {
            r0 = this;
            r0.<init>()
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.f9450Y = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r8, int r9) {
            r7 = this;
            java.util.List<f5.f$c> r9 = r7.f9450Y
            int r9 = r9.size()
            r8.writeInt(r9)
            r0 = 0
            r1 = 0
        Lb:
            if (r1 >= r9) goto L6f
            java.util.List<f5.f$c> r2 = r7.f9450Y
            java.lang.Object r2 = r2.get(r1)
            f5.f$c r2 = (p089f5.C2064f.c) r2
            long r3 = r2.f9453a
            r8.writeLong(r3)
            boolean r3 = r2.f9454b
            byte r3 = (byte) r3
            r8.writeByte(r3)
            boolean r3 = r2.f9455c
            byte r3 = (byte) r3
            r8.writeByte(r3)
            boolean r3 = r2.f9456d
            byte r3 = (byte) r3
            r8.writeByte(r3)
            java.util.List<f5.f$b> r3 = r2.f9458f
            int r3 = r3.size()
            r8.writeInt(r3)
            r4 = 0
        L36:
            if (r4 >= r3) goto L4d
            java.util.List<f5.f$b> r5 = r2.f9458f
            java.lang.Object r5 = r5.get(r4)
            f5.f$b r5 = (p089f5.C2064f.b) r5
            int r6 = r5.f9451a
            r8.writeInt(r6)
            long r5 = r5.f9452b
            r8.writeLong(r5)
            int r4 = r4 + 1
            goto L36
        L4d:
            long r3 = r2.f9457e
            r8.writeLong(r3)
            boolean r3 = r2.f9459g
            byte r3 = (byte) r3
            r8.writeByte(r3)
            long r3 = r2.f9460h
            r8.writeLong(r3)
            int r3 = r2.f9461i
            r8.writeInt(r3)
            int r3 = r2.f9462j
            r8.writeInt(r3)
            int r2 = r2.f9463k
            r8.writeInt(r2)
            int r1 = r1 + 1
            goto Lb
        L6f:
            return
    }
}
