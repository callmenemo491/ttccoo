package p031c1;

/* renamed from: c1.t */
/* loaded from: classes.dex */
public abstract class AbstractC0852t {

    /* renamed from: a */
    public final int f4609a;

    /* renamed from: b */
    public final int f4610b;

    /* renamed from: c */
    public final java.lang.String f4611c;

    /* renamed from: d */
    public int f4612d;

    /* renamed from: e */
    public p031c1.AbstractC0852t.d f4613e;

    /* renamed from: f */
    public android.media.VolumeProvider f4614f;

    /* renamed from: c1.t$a */
    public class a extends android.media.VolumeProvider {

        /* renamed from: a */
        public final /* synthetic */ p031c1.AbstractC0852t f4615a;

        public a(p031c1.AbstractC0852t r1, int r2, int r3, int r4, java.lang.String r5) {
                r0 = this;
                r0.f4615a = r1
                r0.<init>(r2, r3, r4, r5)
                return
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int r4) {
                r3 = this;
                c1.t r0 = r3.f4615a
                f1.r r0 = (p085f1.C1977r) r0
                f1.o$e$d r1 = r0.f8760g
                f1.o$e r1 = r1.f8714c
                f1.o$e$c r1 = r1.f8691k
                f1.q r2 = new f1.q
                r2.<init>(r0, r4)
                r1.post(r2)
                return
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int r4) {
                r3 = this;
                c1.t r0 = r3.f4615a
                f1.r r0 = (p085f1.C1977r) r0
                f1.o$e$d r1 = r0.f8760g
                f1.o$e r1 = r1.f8714c
                f1.o$e$c r1 = r1.f8691k
                f1.p r2 = new f1.p
                r2.<init>(r0, r4)
                r1.post(r2)
                return
        }
    }

    /* renamed from: c1.t$b */
    public class b extends android.media.VolumeProvider {

        /* renamed from: a */
        public final /* synthetic */ p031c1.AbstractC0852t f4616a;

        public b(p031c1.AbstractC0852t r1, int r2, int r3, int r4) {
                r0 = this;
                r0.f4616a = r1
                r0.<init>(r2, r3, r4)
                return
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int r4) {
                r3 = this;
                c1.t r0 = r3.f4616a
                f1.r r0 = (p085f1.C1977r) r0
                f1.o$e$d r1 = r0.f8760g
                f1.o$e r1 = r1.f8714c
                f1.o$e$c r1 = r1.f8691k
                f1.q r2 = new f1.q
                r2.<init>(r0, r4)
                r1.post(r2)
                return
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int r4) {
                r3 = this;
                c1.t r0 = r3.f4616a
                f1.r r0 = (p085f1.C1977r) r0
                f1.o$e$d r1 = r0.f8760g
                f1.o$e r1 = r1.f8714c
                f1.o$e$c r1 = r1.f8691k
                f1.p r2 = new f1.p
                r2.<init>(r0, r4)
                r1.post(r2)
                return
        }
    }

    /* renamed from: c1.t$c */
    public static class c {
        /* renamed from: a */
        public static void m2519a(android.media.VolumeProvider r0, int r1) {
                r0.setCurrentVolume(r1)
                return
        }
    }

    /* renamed from: c1.t$d */
    public static abstract class d {
    }

    public AbstractC0852t(int r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f4609a = r1
            r0.f4610b = r2
            r0.f4612d = r3
            r0.f4611c = r4
            return
    }

    /* renamed from: a */
    public java.lang.Object m2518a() {
            r8 = this;
            android.media.VolumeProvider r0 = r8.f4614f
            if (r0 != 0) goto L28
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1c
            c1.t$a r0 = new c1.t$a
            int r4 = r8.f4609a
            int r5 = r8.f4610b
            int r6 = r8.f4612d
            java.lang.String r7 = r8.f4611c
            r2 = r0
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
        L19:
            r8.f4614f = r0
            goto L28
        L1c:
            c1.t$b r0 = new c1.t$b
            int r1 = r8.f4609a
            int r2 = r8.f4610b
            int r3 = r8.f4612d
            r0.<init>(r8, r1, r2, r3)
            goto L19
        L28:
            android.media.VolumeProvider r0 = r8.f4614f
            return r0
    }
}
