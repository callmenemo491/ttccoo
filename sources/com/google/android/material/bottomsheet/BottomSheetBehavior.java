package com.google.android.material.bottomsheet;

import android.view.View;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c<V> {

    /* renamed from: A */
    public int f5818A;

    /* renamed from: B */
    public float f5819B;

    /* renamed from: C */
    public boolean f5820C;

    /* renamed from: D */
    public boolean f5821D;

    /* renamed from: E */
    public boolean f5822E;

    /* renamed from: F */
    public int f5823F;

    /* renamed from: G */
    public p332t0.C6095c f5824G;

    /* renamed from: H */
    public boolean f5825H;

    /* renamed from: I */
    public int f5826I;

    /* renamed from: J */
    public boolean f5827J;

    /* renamed from: K */
    public int f5828K;

    /* renamed from: L */
    public int f5829L;

    /* renamed from: M */
    public int f5830M;

    /* renamed from: N */
    public java.lang.ref.WeakReference<V> f5831N;

    /* renamed from: O */
    public java.lang.ref.WeakReference<android.view.View> f5832O;

    /* renamed from: P */
    public final java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC1131d> f5833P;

    /* renamed from: Q */
    public android.view.VelocityTracker f5834Q;

    /* renamed from: R */
    public int f5835R;

    /* renamed from: S */
    public int f5836S;

    /* renamed from: T */
    public boolean f5837T;

    /* renamed from: U */
    public java.util.Map<android.view.View, java.lang.Integer> f5838U;

    /* renamed from: V */
    public int f5839V;

    /* renamed from: W */
    public final p332t0.C6095c.c f5840W;

    /* renamed from: a */
    public int f5841a;

    /* renamed from: b */
    public boolean f5842b;

    /* renamed from: c */
    public float f5843c;

    /* renamed from: d */
    public int f5844d;

    /* renamed from: e */
    public boolean f5845e;

    /* renamed from: f */
    public int f5846f;

    /* renamed from: g */
    public int f5847g;

    /* renamed from: h */
    public boolean f5848h;

    /* renamed from: i */
    public p340t8.C6189f f5849i;

    /* renamed from: j */
    public int f5850j;

    /* renamed from: k */
    public int f5851k;

    /* renamed from: l */
    public boolean f5852l;

    /* renamed from: m */
    public boolean f5853m;

    /* renamed from: n */
    public boolean f5854n;

    /* renamed from: o */
    public boolean f5855o;

    /* renamed from: p */
    public boolean f5856p;

    /* renamed from: q */
    public int f5857q;

    /* renamed from: r */
    public int f5858r;

    /* renamed from: s */
    public p340t8.C6192i f5859s;

    /* renamed from: t */
    public boolean f5860t;

    /* renamed from: u */
    public com.google.android.material.bottomsheet.BottomSheetBehavior<V>.RunnableC1133f f5861u;

    /* renamed from: v */
    public android.animation.ValueAnimator f5862v;

    /* renamed from: w */
    public int f5863w;

    /* renamed from: x */
    public int f5864x;

    /* renamed from: y */
    public int f5865y;

    /* renamed from: z */
    public float f5866z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class RunnableC1128a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ android.view.View f5867Y;

        /* renamed from: Z */
        public final /* synthetic */ android.view.ViewGroup.LayoutParams f5868Z;

        public RunnableC1128a(com.google.android.material.bottomsheet.BottomSheetBehavior r1, android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
                r0 = this;
                r0.f5867Y = r2
                r0.f5868Z = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.view.View r0 = r2.f5867Y
                android.view.ViewGroup$LayoutParams r1 = r2.f5868Z
                r0.setLayoutParams(r1)
                return
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class RunnableC1129b implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ android.view.View f5869Y;

        /* renamed from: Z */
        public final /* synthetic */ int f5870Z;

        /* renamed from: a0 */
        public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior f5871a0;

        public RunnableC1129b(com.google.android.material.bottomsheet.BottomSheetBehavior r1, android.view.View r2, int r3) {
                r0 = this;
                r0.f5871a0 = r1
                r0.f5869Y = r2
                r0.f5870Z = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.f5871a0
                android.view.View r1 = r3.f5869Y
                int r2 = r3.f5870Z
                r0.m3286F(r1, r2)
                return
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public class C1130c extends p332t0.C6095c.c {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior f5872a;

        public C1130c(com.google.android.material.bottomsheet.BottomSheetBehavior r1) {
                r0 = this;
                r0.f5872a = r1
                r0.<init>()
                return
        }

        @Override // p332t0.C6095c.c
        /* renamed from: a */
        public int mo3262a(android.view.View r1, int r2, int r3) {
                r0 = this;
                int r1 = r1.getLeft()
                return r1
        }

        @Override // p332t0.C6095c.c
        /* renamed from: b */
        public int mo3263b(android.view.View r2, int r3, int r4) {
                r1 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r1.f5872a
                int r2 = r2.m3300z()
                com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r1.f5872a
                boolean r0 = r4.f5820C
                if (r0 == 0) goto Lf
                int r4 = r4.f5830M
                goto L11
            Lf:
                int r4 = r4.f5818A
            L11:
                int r2 = p064e.C1492f.m4042b(r3, r2, r4)
                return r2
        }

        @Override // p332t0.C6095c.c
        /* renamed from: d */
        public int mo3301d(android.view.View r2) {
                r1 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r1.f5872a
                boolean r0 = r2.f5820C
                if (r0 == 0) goto L9
                int r2 = r2.f5830M
                return r2
            L9:
                int r2 = r2.f5818A
                return r2
        }

        @Override // p332t0.C6095c.c
        /* renamed from: f */
        public void mo3266f(int r3) {
                r2 = this;
                r0 = 1
                if (r3 != r0) goto Lc
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r2.f5872a
                boolean r1 = r3.f5822E
                if (r1 == 0) goto Lc
                r3.m3285E(r0)
            Lc:
                return
        }

        @Override // p332t0.C6095c.c
        /* renamed from: g */
        public void mo3267g(android.view.View r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.f5872a
                r1.m3298w(r3)
                return
        }

        @Override // p332t0.C6095c.c
        /* renamed from: h */
        public void mo3268h(android.view.View r8, float r9, float r10) {
                r7 = this;
                r0 = 1
                r1 = 0
                r2 = 4
                r3 = 6
                r4 = 3
                int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r5 >= 0) goto L26
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f5872a
                boolean r10 = r9.f5842b
                if (r10 == 0) goto L14
            Lf:
                int r9 = r9.f5864x
            L11:
                r2 = 3
                goto L10b
            L14:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r7.f5872a
                int r1 = r10.f5865y
                if (r9 <= r1) goto L21
                r9 = r1
                goto Lc4
            L21:
                int r9 = r10.m3300z()
                goto L11
            L26:
                com.google.android.material.bottomsheet.BottomSheetBehavior r5 = r7.f5872a
                boolean r6 = r5.f5820C
                if (r6 == 0) goto L8d
                boolean r5 = r5.m3288H(r8, r10)
                if (r5 == 0) goto L8d
                float r9 = java.lang.Math.abs(r9)
                float r1 = java.lang.Math.abs(r10)
                int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                if (r9 >= 0) goto L44
                r9 = 1140457472(0x43fa0000, float:500.0)
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 > 0) goto L5a
            L44:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r7.f5872a
                int r1 = r10.f5830M
                int r10 = r10.m3300z()
                int r10 = r10 + r1
                int r10 = r10 / 2
                if (r9 <= r10) goto L57
                r9 = 1
                goto L58
            L57:
                r9 = 0
            L58:
                if (r9 == 0) goto L61
            L5a:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f5872a
                int r9 = r9.f5830M
                r2 = 5
                goto L10b
            L61:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f5872a
                boolean r10 = r9.f5842b
                if (r10 == 0) goto L68
                goto Lf
            L68:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r7.f5872a
                int r10 = r10.m3300z()
                int r9 = r9 - r10
                int r9 = java.lang.Math.abs(r9)
                int r10 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r7.f5872a
                int r1 = r1.f5865y
                int r10 = r10 - r1
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto Lc0
            L86:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f5872a
                int r9 = r9.m3300z()
                goto L11
            L8d:
                int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r1 == 0) goto Lc9
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L9e
                goto Lc9
            L9e:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f5872a
                boolean r10 = r9.f5842b
                if (r10 == 0) goto La7
            La4:
                int r9 = r9.f5818A
                goto L10b
            La7:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r7.f5872a
                int r10 = r10.f5865y
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r7.f5872a
                int r1 = r1.f5818A
                int r9 = r9 - r1
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto Lc6
            Lc0:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f5872a
                int r9 = r9.f5865y
            Lc4:
                r2 = 6
                goto L10b
            Lc6:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f5872a
                goto La4
            Lc9:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r7.f5872a
                boolean r1 = r10.f5842b
                if (r1 == 0) goto Lea
                int r10 = r10.f5864x
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r7.f5872a
                int r1 = r1.f5818A
                int r9 = r9 - r1
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto Lc6
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f5872a
                goto Lf
            Lea:
                int r1 = r10.f5865y
                if (r9 >= r1) goto Lf9
                int r10 = r10.f5818A
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto Lc0
                goto L86
            Lf9:
                int r10 = r9 - r1
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r7.f5872a
                int r1 = r1.f5818A
                int r9 = r9 - r1
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto Lc6
                goto Lc0
            L10b:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r7.f5872a
                r10.m3289I(r8, r2, r9, r0)
                return
        }

        @Override // p332t0.C6095c.c
        /* renamed from: i */
        public boolean mo3269i(android.view.View r6, int r7) {
                r5 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r5.f5872a
                int r1 = r0.f5823F
                r2 = 0
                r3 = 1
                if (r1 != r3) goto L9
                return r2
            L9:
                boolean r4 = r0.f5837T
                if (r4 == 0) goto Le
                return r2
            Le:
                r4 = 3
                if (r1 != r4) goto L2b
                int r1 = r0.f5835R
                if (r1 != r7) goto L2b
                java.lang.ref.WeakReference<android.view.View> r7 = r0.f5832O
                if (r7 == 0) goto L20
                java.lang.Object r7 = r7.get()
                android.view.View r7 = (android.view.View) r7
                goto L21
            L20:
                r7 = 0
            L21:
                if (r7 == 0) goto L2b
                r0 = -1
                boolean r7 = r7.canScrollVertically(r0)
                if (r7 == 0) goto L2b
                return r2
            L2b:
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = r5.f5872a
                java.lang.ref.WeakReference<V extends android.view.View> r7 = r7.f5831N
                if (r7 == 0) goto L38
                java.lang.Object r7 = r7.get()
                if (r7 != r6) goto L38
                r2 = 1
            L38:
                return r2
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public static abstract class AbstractC1131d {
        public AbstractC1131d() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public abstract void mo2682a(android.view.View r1, float r2);

        /* renamed from: b */
        public abstract void mo2683b(android.view.View r1, int r2);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public static class C1132e extends p320s0.AbstractC5943a {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomsheet.BottomSheetBehavior.C1132e> CREATOR = null;

        /* renamed from: a0 */
        public final int f5873a0;

        /* renamed from: b0 */
        public int f5874b0;

        /* renamed from: c0 */
        public boolean f5875c0;

        /* renamed from: d0 */
        public boolean f5876d0;

        /* renamed from: e0 */
        public boolean f5877e0;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e$a */
        public static class a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.bottomsheet.BottomSheetBehavior.C1132e> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    com.google.android.material.bottomsheet.BottomSheetBehavior$e r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$e
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.bottomsheet.BottomSheetBehavior.C1132e createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    com.google.android.material.bottomsheet.BottomSheetBehavior$e r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$e
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.bottomsheet.BottomSheetBehavior$e[] r1 = new com.google.android.material.bottomsheet.BottomSheetBehavior.C1132e[r1]
                    return r1
            }
        }

        static {
                com.google.android.material.bottomsheet.BottomSheetBehavior$e$a r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$e$a
                r0.<init>()
                com.google.android.material.bottomsheet.BottomSheetBehavior.C1132e.CREATOR = r0
                return
        }

        public C1132e(android.os.Parcel r3, java.lang.ClassLoader r4) {
                r2 = this;
                r2.<init>(r3, r4)
                int r4 = r3.readInt()
                r2.f5873a0 = r4
                int r4 = r3.readInt()
                r2.f5874b0 = r4
                int r4 = r3.readInt()
                r0 = 0
                r1 = 1
                if (r4 != r1) goto L19
                r4 = 1
                goto L1a
            L19:
                r4 = 0
            L1a:
                r2.f5875c0 = r4
                int r4 = r3.readInt()
                if (r4 != r1) goto L24
                r4 = 1
                goto L25
            L24:
                r4 = 0
            L25:
                r2.f5876d0 = r4
                int r3 = r3.readInt()
                if (r3 != r1) goto L2e
                r0 = 1
            L2e:
                r2.f5877e0 = r0
                return
        }

        public C1132e(android.os.Parcelable r1, com.google.android.material.bottomsheet.BottomSheetBehavior<?> r2) {
                r0 = this;
                r0.<init>(r1)
                int r1 = r2.f5823F
                r0.f5873a0 = r1
                int r1 = r2.f5844d
                r0.f5874b0 = r1
                boolean r1 = r2.f5842b
                r0.f5875c0 = r1
                boolean r1 = r2.f5820C
                r0.f5876d0 = r1
                boolean r1 = r2.f5821D
                r0.f5877e0 = r1
                return
        }

        @Override // p320s0.AbstractC5943a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                android.os.Parcelable r0 = r1.f22819Y
                r2.writeParcelable(r0, r3)
                int r3 = r1.f5873a0
                r2.writeInt(r3)
                int r3 = r1.f5874b0
                r2.writeInt(r3)
                boolean r3 = r1.f5875c0
                r2.writeInt(r3)
                boolean r3 = r1.f5876d0
                r2.writeInt(r3)
                boolean r3 = r1.f5877e0
                r2.writeInt(r3)
                return
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public class RunnableC1133f implements java.lang.Runnable {

        /* renamed from: Y */
        public final android.view.View f5878Y;

        /* renamed from: Z */
        public boolean f5879Z;

        /* renamed from: a0 */
        public int f5880a0;

        /* renamed from: b0 */
        public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior f5881b0;

        public RunnableC1133f(com.google.android.material.bottomsheet.BottomSheetBehavior r1, android.view.View r2, int r3) {
                r0 = this;
                r0.f5881b0 = r1
                r0.<init>()
                r0.f5878Y = r2
                r0.f5880a0 = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.f5881b0
                t0.c r0 = r0.f5824G
                if (r0 == 0) goto L15
                r1 = 1
                boolean r0 = r0.m12575i(r1)
                if (r0 == 0) goto L15
                android.view.View r0 = r2.f5878Y
                java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
                p227n0.C4661t.c.m10565m(r0, r2)
                goto L1c
            L15:
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.f5881b0
                int r1 = r2.f5880a0
                r0.m3285E(r1)
            L1c:
                r0 = 0
                r2.f5879Z = r0
                return
        }
    }

    public BottomSheetBehavior() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f5841a = r0
            r0 = 1
            r3.f5842b = r0
            r1 = -1
            r3.f5850j = r1
            r2 = 0
            r3.f5861u = r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r3.f5866z = r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f5819B = r2
            r3.f5822E = r0
            r0 = 4
            r3.f5823F = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f5833P = r0
            r3.f5839V = r1
            com.google.android.material.bottomsheet.BottomSheetBehavior$c r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c
            r0.<init>(r3)
            r3.f5840W = r0
            return
    }

    public BottomSheetBehavior(android.content.Context r12, android.util.AttributeSet r13) {
            r11 = this;
            r11.<init>(r12, r13)
            r0 = 0
            r11.f5841a = r0
            r1 = 1
            r11.f5842b = r1
            r2 = -1
            r11.f5850j = r2
            r3 = 0
            r11.f5861u = r3
            r4 = 1056964608(0x3f000000, float:0.5)
            r11.f5866z = r4
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.f5819B = r5
            r11.f5822E = r1
            r6 = 4
            r11.f5823F = r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r11.f5833P = r7
            r11.f5839V = r2
            com.google.android.material.bottomsheet.BottomSheetBehavior$c r7 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c
            r7.<init>(r11)
            r11.f5840W = r7
            android.content.res.Resources r7 = r12.getResources()
            r8 = 2131165593(0x7f070199, float:1.7945407E38)
            int r7 = r7.getDimensionPixelSize(r8)
            r11.f5847g = r7
            int[] r7 = p339t7.C6183a.f24009f
            android.content.res.TypedArray r7 = r12.obtainStyledAttributes(r13, r7)
            r8 = 16
            boolean r9 = r7.hasValue(r8)
            r11.f5848h = r9
            r9 = 2
            boolean r10 = r7.hasValue(r9)
            if (r10 == 0) goto L56
            android.content.res.ColorStateList r3 = p288q8.C5599c.m11875a(r12, r7, r9)
            r11.m3297v(r12, r13, r10, r3)
            goto L59
        L56:
            r11.m3297v(r12, r13, r10, r3)
        L59:
            float[] r13 = new float[r9]
            r13 = {x0164: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r13 = android.animation.ValueAnimator.ofFloat(r13)
            r11.f5862v = r13
            r9 = 500(0x1f4, double:2.47E-321)
            r13.setDuration(r9)
            android.animation.ValueAnimator r13 = r11.f5862v
            a8.a r3 = new a8.a
            r3.<init>(r11)
            r13.addUpdateListener(r3)
            float r13 = r7.getDimension(r1, r5)
            r11.f5819B = r13
            boolean r13 = r7.hasValue(r0)
            if (r13 == 0) goto L85
            int r13 = r7.getDimensionPixelSize(r0, r2)
            r11.f5850j = r13
        L85:
            r13 = 8
            android.util.TypedValue r3 = r7.peekValue(r13)
            if (r3 == 0) goto L95
            int r3 = r3.data
            if (r3 != r2) goto L95
            r11.m3283C(r3)
            goto L9c
        L95:
            int r13 = r7.getDimensionPixelSize(r13, r2)
            r11.m3283C(r13)
        L9c:
            r13 = 7
            boolean r13 = r7.getBoolean(r13, r0)
            r11.m3282B(r13)
            r13 = 11
            boolean r13 = r7.getBoolean(r13, r0)
            r11.f5852l = r13
            r13 = 5
            boolean r13 = r7.getBoolean(r13, r1)
            boolean r2 = r11.f5842b
            r3 = 6
            r5 = 3
            if (r2 != r13) goto Lb8
            goto Ld3
        Lb8:
            r11.f5842b = r13
            java.lang.ref.WeakReference<V extends android.view.View> r13 = r11.f5831N
            if (r13 == 0) goto Lc1
            r11.m3295t()
        Lc1:
            boolean r13 = r11.f5842b
            if (r13 == 0) goto Lcb
            int r13 = r11.f5823F
            if (r13 != r3) goto Lcb
            r13 = 3
            goto Lcd
        Lcb:
            int r13 = r11.f5823F
        Lcd:
            r11.m3285E(r13)
            r11.m3290J()
        Ld3:
            r13 = 10
            boolean r13 = r7.getBoolean(r13, r0)
            r11.f5821D = r13
            boolean r13 = r7.getBoolean(r5, r1)
            r11.f5822E = r13
            r13 = 9
            int r13 = r7.getInt(r13, r0)
            r11.f5841a = r13
            float r13 = r7.getFloat(r3, r4)
            r2 = 0
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 <= 0) goto L15b
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r3 >= 0) goto L15b
            r11.f5866z = r13
            java.lang.ref.WeakReference<V extends android.view.View> r3 = r11.f5831N
            if (r3 == 0) goto L107
            int r3 = r11.f5830M
            float r3 = (float) r3
            float r2 = r2 - r13
            float r2 = r2 * r3
            int r13 = (int) r2
            r11.f5865y = r13
        L107:
            android.util.TypedValue r13 = r7.peekValue(r6)
            java.lang.String r2 = "offset must be greater than or equal to 0"
            if (r13 == 0) goto L11e
            int r3 = r13.type
            if (r3 != r8) goto L11e
            int r13 = r13.data
            if (r13 < 0) goto L118
            goto L124
        L118:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r2)
            throw r12
        L11e:
            int r13 = r7.getDimensionPixelOffset(r6, r0)
            if (r13 < 0) goto L155
        L124:
            r11.f5863w = r13
            r13 = 12
            boolean r13 = r7.getBoolean(r13, r0)
            r11.f5853m = r13
            r13 = 13
            boolean r13 = r7.getBoolean(r13, r0)
            r11.f5854n = r13
            r13 = 14
            boolean r13 = r7.getBoolean(r13, r0)
            r11.f5855o = r13
            r13 = 15
            boolean r13 = r7.getBoolean(r13, r1)
            r11.f5856p = r13
            r7.recycle()
            android.view.ViewConfiguration r12 = android.view.ViewConfiguration.get(r12)
            int r12 = r12.getScaledMaximumFlingVelocity()
            float r12 = (float) r12
            r11.f5843c = r12
            return
        L155:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r2)
            throw r12
        L15b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "ratio must be a float value between 0 and 1"
            r12.<init>(r13)
            throw r12
    }

    /* renamed from: y */
    public static <V extends android.view.View> com.google.android.material.bottomsheet.BottomSheetBehavior<V> m3280y(V r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f
            if (r0 == 0) goto L1b
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r1.f1930a
            boolean r0 = r1 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r0 == 0) goto L13
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            return r1
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The view is not associated with BottomSheetBehavior"
            r1.<init>(r0)
            throw r1
        L1b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The view is not a child of CoordinatorLayout"
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: A */
    public final void m3281A(V r2, p242o0.C4868b.a r3, int r4) {
            r1 = this;
            a8.c r0 = new a8.c
            r0.<init>(r1, r4)
            r4 = 0
            p227n0.C4661t.m10544t(r2, r3, r4, r0)
            return
    }

    /* renamed from: B */
    public void m3282B(boolean r2) {
            r1 = this;
            boolean r0 = r1.f5820C
            if (r0 == r2) goto L14
            r1.f5820C = r2
            if (r2 != 0) goto L11
            int r2 = r1.f5823F
            r0 = 5
            if (r2 != r0) goto L11
            r2 = 4
            r1.m3284D(r2)
        L11:
            r1.m3290J()
        L14:
            return
    }

    /* renamed from: C */
    public void m3283C(int r4) {
            r3 = this;
            r0 = 1
            r1 = -1
            r2 = 0
            if (r4 != r1) goto Lc
            boolean r4 = r3.f5845e
            if (r4 != 0) goto L15
            r3.f5845e = r0
            goto L1f
        Lc:
            boolean r1 = r3.f5845e
            if (r1 != 0) goto L17
            int r1 = r3.f5844d
            if (r1 == r4) goto L15
            goto L17
        L15:
            r0 = 0
            goto L1f
        L17:
            r3.f5845e = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.f5844d = r4
        L1f:
            if (r0 == 0) goto L24
            r3.m3293M(r2)
        L24:
            return
    }

    /* renamed from: D */
    public void m3284D(int r2) {
            r1 = this;
            int r0 = r1.f5823F
            if (r2 != r0) goto L5
            return
        L5:
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r1.f5831N
            if (r0 != 0) goto L1c
            r0 = 4
            if (r2 == r0) goto L19
            r0 = 3
            if (r2 == r0) goto L19
            r0 = 6
            if (r2 == r0) goto L19
            boolean r0 = r1.f5820C
            if (r0 == 0) goto L1b
            r0 = 5
            if (r2 != r0) goto L1b
        L19:
            r1.f5823F = r2
        L1b:
            return
        L1c:
            r1.m3287G(r2)
            return
    }

    /* renamed from: E */
    public void m3285E(int r4) {
            r3 = this;
            int r0 = r3.f5823F
            if (r0 != r4) goto L5
            return
        L5:
            r3.f5823F = r4
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r3.f5831N
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L15
            return
        L15:
            r1 = 3
            r2 = 0
            if (r4 != r1) goto L1e
            r1 = 1
            r3.m3292L(r1)
            goto L2a
        L1e:
            r1 = 6
            if (r4 == r1) goto L27
            r1 = 5
            if (r4 == r1) goto L27
            r1 = 4
            if (r4 != r1) goto L2a
        L27:
            r3.m3292L(r2)
        L2a:
            r3.m3291K(r4)
        L2d:
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$d> r1 = r3.f5833P
            int r1 = r1.size()
            if (r2 >= r1) goto L43
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$d> r1 = r3.f5833P
            java.lang.Object r1 = r1.get(r2)
            com.google.android.material.bottomsheet.BottomSheetBehavior$d r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC1131d) r1
            r1.mo2683b(r0, r4)
            int r2 = r2 + 1
            goto L2d
        L43:
            r3.m3290J()
            return
    }

    /* renamed from: F */
    public void m3286F(android.view.View r3, int r4) {
            r2 = this;
            r0 = 3
            r1 = 4
            if (r4 != r1) goto L7
            int r0 = r2.f5818A
            goto L27
        L7:
            r1 = 6
            if (r4 != r1) goto L17
            int r0 = r2.f5865y
            boolean r1 = r2.f5842b
            if (r1 == 0) goto L27
            int r1 = r2.f5864x
            if (r0 > r1) goto L27
            r4 = 3
            r0 = r1
            goto L27
        L17:
            if (r4 != r0) goto L1e
            int r0 = r2.m3300z()
            goto L27
        L1e:
            boolean r0 = r2.f5820C
            if (r0 == 0) goto L2c
            r0 = 5
            if (r4 != r0) goto L2c
            int r0 = r2.f5830M
        L27:
            r1 = 0
            r2.m3289I(r3, r4, r0, r1)
            return
        L2c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Illegal state argument: "
            java.lang.String r4 = android.support.v4.media.C0142a.m254a(r0, r4)
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: G */
    public final void m3287G(int r3) {
            r2 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.f5831N
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L28
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L28
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            boolean r1 = p227n0.C4661t.f.m10587b(r0)
            if (r1 == 0) goto L28
            com.google.android.material.bottomsheet.BottomSheetBehavior$b r1 = new com.google.android.material.bottomsheet.BottomSheetBehavior$b
            r1.<init>(r2, r0, r3)
            r0.post(r1)
            goto L2b
        L28:
            r2.m3286F(r0, r3)
        L2b:
            return
    }

    /* renamed from: H */
    public boolean m3288H(android.view.View r5, float r6) {
            r4 = this;
            boolean r0 = r4.f5821D
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r5.getTop()
            int r2 = r4.f5818A
            r3 = 0
            if (r0 >= r2) goto L10
            return r3
        L10:
            int r0 = r4.m3296u()
            int r5 = r5.getTop()
            float r5 = (float) r5
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r6 = r6 * r2
            float r6 = r6 + r5
            int r5 = r4.f5818A
            float r5 = (float) r5
            float r6 = r6 - r5
            float r5 = java.lang.Math.abs(r6)
            float r6 = (float) r0
            float r5 = r5 / r6
            r6 = 1056964608(0x3f000000, float:0.5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L30
            goto L31
        L30:
            r1 = 0
        L31:
            return r1
    }

    /* renamed from: I */
    public void m3289I(android.view.View r5, int r6, int r7, boolean r8) {
            r4 = this;
            t0.c r0 = r4.f5824G
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L30
            if (r8 == 0) goto L13
            int r8 = r5.getLeft()
            boolean r7 = r0.m12586t(r8, r7)
            if (r7 == 0) goto L30
            goto L2f
        L13:
            int r8 = r5.getLeft()
            r0.f23538r = r5
            r3 = -1
            r0.f23523c = r3
            boolean r7 = r0.m12578l(r8, r7, r2, r2)
            if (r7 != 0) goto L2d
            int r8 = r0.f23521a
            if (r8 != 0) goto L2d
            android.view.View r8 = r0.f23538r
            if (r8 == 0) goto L2d
            r8 = 0
            r0.f23538r = r8
        L2d:
            if (r7 == 0) goto L30
        L2f:
            r2 = 1
        L30:
            if (r2 == 0) goto L56
            r7 = 2
            r4.m3285E(r7)
            r4.m3291K(r6)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$f r7 = r4.f5861u
            if (r7 != 0) goto L44
            com.google.android.material.bottomsheet.BottomSheetBehavior$f r7 = new com.google.android.material.bottomsheet.BottomSheetBehavior$f
            r7.<init>(r4, r5, r6)
            r4.f5861u = r7
        L44:
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$f r7 = r4.f5861u
            boolean r8 = r7.f5879Z
            r7.f5880a0 = r6
            if (r8 != 0) goto L59
            java.util.WeakHashMap<android.view.View, n0.w> r6 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10565m(r5, r7)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$f r5 = r4.f5861u
            r5.f5879Z = r1
            goto L59
        L56:
            r4.m3285E(r6)
        L59:
            return
    }

    /* renamed from: J */
    public final void m3290J() {
            r14 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r14.f5831N
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Le
            return
        Le:
            r1 = 524288(0x80000, float:7.34684E-40)
            p227n0.C4661t.m10543s(r1, r0)
            r1 = 0
            p227n0.C4661t.m10537m(r0, r1)
            r2 = 262144(0x40000, float:3.67342E-40)
            p227n0.C4661t.m10543s(r2, r0)
            p227n0.C4661t.m10537m(r0, r1)
            r2 = 1048576(0x100000, float:1.469368E-39)
            p227n0.C4661t.m10543s(r2, r0)
            p227n0.C4661t.m10537m(r0, r1)
            int r2 = r14.f5839V
            r3 = -1
            if (r2 == r3) goto L32
            p227n0.C4661t.m10543s(r2, r0)
            p227n0.C4661t.m10537m(r0, r1)
        L32:
            boolean r2 = r14.f5842b
            r4 = 6
            if (r2 != 0) goto Lb2
            int r2 = r14.f5823F
            if (r2 == r4) goto Lb2
            r2 = 2131951659(0x7f13002b, float:1.9539739E38)
            android.content.res.Resources r5 = r0.getResources()
            java.lang.String r9 = r5.getString(r2)
            a8.c r10 = new a8.c
            r10.<init>(r14, r4)
            java.util.List r2 = p227n0.C4661t.m10534j(r0)
            r5 = 0
        L50:
            int r6 = r2.size()
            if (r5 >= r6) goto L74
            java.lang.Object r6 = r2.get(r5)
            o0.b$a r6 = (p242o0.C4868b.a) r6
            java.lang.CharSequence r6 = r6.m11000b()
            boolean r6 = android.text.TextUtils.equals(r9, r6)
            if (r6 == 0) goto L71
            java.lang.Object r1 = r2.get(r5)
            o0.b$a r1 = (p242o0.C4868b.a) r1
            int r1 = r1.m10999a()
            goto La2
        L71:
            int r5 = r5 + 1
            goto L50
        L74:
            r5 = -1
            r6 = 0
        L76:
            int[] r7 = p227n0.C4661t.f18574e
            int r8 = r7.length
            if (r6 >= r8) goto La1
            if (r5 != r3) goto La1
            r7 = r7[r6]
            r8 = 1
            r11 = 0
            r12 = 1
        L82:
            int r13 = r2.size()
            if (r11 >= r13) goto L9b
            java.lang.Object r13 = r2.get(r11)
            o0.b$a r13 = (p242o0.C4868b.a) r13
            int r13 = r13.m10999a()
            if (r13 == r7) goto L96
            r13 = 1
            goto L97
        L96:
            r13 = 0
        L97:
            r12 = r12 & r13
            int r11 = r11 + 1
            goto L82
        L9b:
            if (r12 == 0) goto L9e
            r5 = r7
        L9e:
            int r6 = r6 + 1
            goto L76
        La1:
            r1 = r5
        La2:
            if (r1 == r3) goto Lb0
            o0.b$a r2 = new o0.b$a
            r7 = 0
            r11 = 0
            r6 = r2
            r8 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            p227n0.C4661t.m10525a(r0, r2)
        Lb0:
            r14.f5839V = r1
        Lb2:
            boolean r1 = r14.f5820C
            if (r1 == 0) goto Lc0
            int r1 = r14.f5823F
            r2 = 5
            if (r1 == r2) goto Lc0
            o0.b$a r1 = p242o0.C4868b.a.f19345j
            r14.m3281A(r0, r1, r2)
        Lc0:
            int r1 = r14.f5823F
            r2 = 4
            r3 = 3
            if (r1 == r3) goto Lde
            if (r1 == r2) goto Ld6
            if (r1 == r4) goto Lcb
            goto Le8
        Lcb:
            o0.b$a r1 = p242o0.C4868b.a.f19344i
            r14.m3281A(r0, r1, r2)
            o0.b$a r1 = p242o0.C4868b.a.f19343h
            r14.m3281A(r0, r1, r3)
            goto Le8
        Ld6:
            boolean r1 = r14.f5842b
            if (r1 == 0) goto Ldb
            r4 = 3
        Ldb:
            o0.b$a r1 = p242o0.C4868b.a.f19343h
            goto Le5
        Lde:
            boolean r1 = r14.f5842b
            if (r1 == 0) goto Le3
            r4 = 4
        Le3:
            o0.b$a r1 = p242o0.C4868b.a.f19344i
        Le5:
            r14.m3281A(r0, r1, r4)
        Le8:
            return
    }

    /* renamed from: K */
    public final void m3291K(int r6) {
            r5 = this;
            r0 = 2
            if (r6 != r0) goto L4
            return
        L4:
            r1 = 3
            r2 = 1
            r3 = 0
            if (r6 != r1) goto Lb
            r6 = 1
            goto Lc
        Lb:
            r6 = 0
        Lc:
            boolean r1 = r5.f5860t
            if (r1 == r6) goto L3f
            r5.f5860t = r6
            t8.f r1 = r5.f5849i
            if (r1 == 0) goto L3f
            android.animation.ValueAnimator r1 = r5.f5862v
            if (r1 == 0) goto L3f
            boolean r1 = r1.isRunning()
            if (r1 == 0) goto L26
            android.animation.ValueAnimator r6 = r5.f5862v
            r6.reverse()
            goto L3f
        L26:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L2c
            r6 = 0
            goto L2e
        L2c:
            r6 = 1065353216(0x3f800000, float:1.0)
        L2e:
            float r1 = r1 - r6
            android.animation.ValueAnimator r4 = r5.f5862v
            float[] r0 = new float[r0]
            r0[r3] = r1
            r0[r2] = r6
            r4.setFloatValues(r0)
            android.animation.ValueAnimator r6 = r5.f5862v
            r6.start()
        L3f:
            return
    }

    /* renamed from: L */
    public final void m3292L(boolean r7) {
            r6 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r6.f5831N
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r1 != 0) goto L14
            return
        L14:
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            int r1 = r0.getChildCount()
            if (r7 == 0) goto L29
            java.util.Map<android.view.View, java.lang.Integer> r2 = r6.f5838U
            if (r2 != 0) goto L28
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r1)
            r6.f5838U = r2
            goto L29
        L28:
            return
        L29:
            r2 = 0
        L2a:
            if (r2 >= r1) goto L4b
            android.view.View r3 = r0.getChildAt(r2)
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r6.f5831N
            java.lang.Object r4 = r4.get()
            if (r3 != r4) goto L39
            goto L48
        L39:
            if (r7 == 0) goto L48
            java.util.Map<android.view.View, java.lang.Integer> r4 = r6.f5838U
            int r5 = r3.getImportantForAccessibility()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.put(r3, r5)
        L48:
            int r2 = r2 + 1
            goto L2a
        L4b:
            if (r7 != 0) goto L50
            r7 = 0
            r6.f5838U = r7
        L50:
            return
    }

    /* renamed from: M */
    public final void m3293M(boolean r3) {
            r2 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.f5831N
            if (r0 == 0) goto L21
            r2.m3295t()
            int r0 = r2.f5823F
            r1 = 4
            if (r0 != r1) goto L21
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.f5831N
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L21
            if (r3 == 0) goto L1e
            int r3 = r2.f5823F
            r2.m3287G(r3)
            goto L21
        L1e:
            r0.requestLayout()
        L21:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: c */
    public void mo987c(androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f r1) {
            r0 = this;
            r1 = 0
            r0.f5831N = r1
            r0.f5824G = r1
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: f */
    public void mo990f() {
            r1 = this;
            r0 = 0
            r1.f5831N = r0
            r1.f5824G = r0
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: g */
    public boolean mo991g(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Ld8
            boolean r0 = r9.f5822E
            if (r0 != 0) goto Le
            goto Ld8
        Le:
            int r0 = r12.getActionMasked()
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L21
            r9.f5835R = r4
            android.view.VelocityTracker r5 = r9.f5834Q
            if (r5 == 0) goto L21
            r5.recycle()
            r9.f5834Q = r3
        L21:
            android.view.VelocityTracker r5 = r9.f5834Q
            if (r5 != 0) goto L2b
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r9.f5834Q = r5
        L2b:
            android.view.VelocityTracker r5 = r9.f5834Q
            r5.addMovement(r12)
            r5 = 2
            if (r0 == 0) goto L44
            if (r0 == r2) goto L39
            r11 = 3
            if (r0 == r11) goto L39
            goto L87
        L39:
            r9.f5837T = r1
            r9.f5835R = r4
            boolean r11 = r9.f5825H
            if (r11 == 0) goto L87
            r9.f5825H = r1
            return r1
        L44:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f5836S = r7
            int r7 = r9.f5823F
            if (r7 == r5) goto L76
            java.lang.ref.WeakReference<android.view.View> r7 = r9.f5832O
            if (r7 == 0) goto L5f
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L60
        L5f:
            r7 = r3
        L60:
            if (r7 == 0) goto L76
            int r8 = r9.f5836S
            boolean r7 = r10.m974p(r7, r6, r8)
            if (r7 == 0) goto L76
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f5835R = r7
            r9.f5837T = r2
        L76:
            int r7 = r9.f5835R
            if (r7 != r4) goto L84
            int r4 = r9.f5836S
            boolean r11 = r10.m974p(r11, r6, r4)
            if (r11 != 0) goto L84
            r11 = 1
            goto L85
        L84:
            r11 = 0
        L85:
            r9.f5825H = r11
        L87:
            boolean r11 = r9.f5825H
            if (r11 != 0) goto L96
            t0.c r11 = r9.f5824G
            if (r11 == 0) goto L96
            boolean r11 = r11.m12587u(r12)
            if (r11 == 0) goto L96
            return r2
        L96:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.f5832O
            if (r11 == 0) goto La1
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        La1:
            if (r0 != r5) goto Ld7
            if (r3 == 0) goto Ld7
            boolean r11 = r9.f5825H
            if (r11 != 0) goto Ld7
            int r11 = r9.f5823F
            if (r11 == r2) goto Ld7
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.m974p(r3, r11, r0)
            if (r10 != 0) goto Ld7
            t0.c r10 = r9.f5824G
            if (r10 == 0) goto Ld7
            int r10 = r9.f5836S
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            t0.c r11 = r9.f5824G
            int r11 = r11.f23522b
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto Ld7
            r1 = 1
        Ld7:
            return r1
        Ld8:
            r9.f5825H = r2
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: h */
    public boolean mo992h(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, int r10) {
            r7 = this;
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.c.m10554b(r8)
            r1 = 1
            if (r0 == 0) goto L12
            boolean r0 = p227n0.C4661t.c.m10554b(r9)
            if (r0 != 0) goto L12
            r9.setFitsSystemWindows(r1)
        L12:
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r7.f5831N
            r2 = 3
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 != 0) goto Laf
            android.content.res.Resources r0 = r8.getResources()
            r5 = 2131165334(0x7f070096, float:1.7944882E38)
            int r0 = r0.getDimensionPixelSize(r5)
            r7.f5846f = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L37
            boolean r0 = r7.f5852l
            if (r0 != 0) goto L37
            boolean r0 = r7.f5845e
            if (r0 != 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            boolean r5 = r7.f5853m
            if (r5 != 0) goto L47
            boolean r5 = r7.f5854n
            if (r5 != 0) goto L47
            boolean r5 = r7.f5855o
            if (r5 != 0) goto L47
            if (r0 != 0) goto L47
            goto L4f
        L47:
            a8.b r5 = new a8.b
            r5.<init>(r7, r0)
            p220m8.C4430n.m9883a(r9, r5)
        L4f:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r9)
            r7.f5831N = r0
            boolean r0 = r7.f5848h
            if (r0 == 0) goto L61
            t8.f r0 = r7.f5849i
            if (r0 == 0) goto L61
            p227n0.C4661t.c.m10569q(r9, r0)
        L61:
            t8.f r0 = r7.f5849i
            if (r0 == 0) goto L88
            float r5 = r7.f5819B
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 != 0) goto L71
            float r5 = p227n0.C4661t.h.m10604i(r9)
        L71:
            r0.m12772p(r5)
            int r0 = r7.f5823F
            if (r0 != r2) goto L7a
            r0 = 1
            goto L7b
        L7a:
            r0 = 0
        L7b:
            r7.f5860t = r0
            t8.f r5 = r7.f5849i
            if (r0 == 0) goto L83
            r0 = 0
            goto L85
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
        L85:
            r5.m12774r(r0)
        L88:
            r7.m3290J()
            int r0 = p227n0.C4661t.c.m10555c(r9)
            if (r0 != 0) goto L94
            p227n0.C4661t.c.m10571s(r9, r1)
        L94:
            int r0 = r9.getMeasuredWidth()
            int r5 = r7.f5850j
            if (r0 <= r5) goto Laf
            r0 = -1
            if (r5 == r0) goto Laf
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            int r5 = r7.f5850j
            r0.width = r5
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r5 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r5.<init>(r7, r9, r0)
            r9.post(r5)
        Laf:
            t0.c r0 = r7.f5824G
            if (r0 != 0) goto Lc0
            t0.c$c r0 = r7.f5840W
            t0.c r5 = new t0.c
            android.content.Context r6 = r8.getContext()
            r5.<init>(r6, r8, r0)
            r7.f5824G = r5
        Lc0:
            int r0 = r9.getTop()
            r8.m976r(r9, r10)
            int r10 = r8.getWidth()
            r7.f5829L = r10
            int r8 = r8.getHeight()
            r7.f5830M = r8
            int r8 = r9.getHeight()
            r7.f5828K = r8
            int r10 = r7.f5830M
            int r8 = r10 - r8
            int r5 = r7.f5858r
            if (r8 >= r5) goto Lec
            boolean r8 = r7.f5856p
            if (r8 == 0) goto Le8
            r7.f5828K = r10
            goto Lec
        Le8:
            int r8 = r10 - r5
            r7.f5828K = r8
        Lec:
            int r8 = r7.f5828K
            int r10 = r10 - r8
            int r8 = java.lang.Math.max(r4, r10)
            r7.f5864x = r8
            int r8 = r7.f5830M
            float r8 = (float) r8
            float r10 = r7.f5866z
            float r3 = r3 - r10
            float r3 = r3 * r8
            int r8 = (int) r3
            r7.f5865y = r8
            r7.m3295t()
            int r8 = r7.f5823F
            if (r8 != r2) goto L10c
            int r8 = r7.m3300z()
            goto L121
        L10c:
            r10 = 6
            if (r8 != r10) goto L112
            int r8 = r7.f5865y
            goto L121
        L112:
            boolean r10 = r7.f5820C
            if (r10 == 0) goto L11c
            r10 = 5
            if (r8 != r10) goto L11c
            int r8 = r7.f5830M
            goto L121
        L11c:
            r10 = 4
            if (r8 != r10) goto L125
            int r8 = r7.f5818A
        L121:
            p227n0.C4661t.m10539o(r9, r8)
            goto L132
        L125:
            if (r8 == r1) goto L12a
            r10 = 2
            if (r8 != r10) goto L132
        L12a:
            int r8 = r9.getTop()
            int r0 = r0 - r8
            p227n0.C4661t.m10539o(r9, r0)
        L132:
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            android.view.View r9 = r7.m3299x(r9)
            r8.<init>(r9)
            r7.f5832O = r8
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: j */
    public boolean mo994j(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, float r4, float r5) {
            r0 = this;
            java.lang.ref.WeakReference<android.view.View> r1 = r0.f5832O
            if (r1 == 0) goto L12
            java.lang.Object r1 = r1.get()
            if (r3 != r1) goto L12
            int r1 = r0.f5823F
            r2 = 3
            if (r1 != r2) goto L10
            goto L12
        L10:
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: k */
    public void mo995k(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5, int r6, int[] r7, int r8) {
            r1 = this;
            r2 = 1
            if (r8 != r2) goto L4
            return
        L4:
            java.lang.ref.WeakReference<android.view.View> r5 = r1.f5832O
            if (r5 == 0) goto Lf
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            goto L10
        Lf:
            r5 = 0
        L10:
            if (r4 == r5) goto L13
            return
        L13:
            int r5 = r3.getTop()
            int r8 = r5 - r6
            if (r6 <= 0) goto L38
            int r4 = r1.m3300z()
            if (r8 >= r4) goto L30
            int r4 = r1.m3300z()
            int r5 = r5 - r4
            r7[r2] = r5
            r4 = r7[r2]
            int r4 = -r4
            p227n0.C4661t.m10539o(r3, r4)
            r4 = 3
            goto L54
        L30:
            boolean r4 = r1.f5822E
            if (r4 != 0) goto L35
            return
        L35:
            r7[r2] = r6
            goto L5f
        L38:
            if (r6 >= 0) goto L66
            r0 = -1
            boolean r4 = r4.canScrollVertically(r0)
            if (r4 != 0) goto L66
            int r4 = r1.f5818A
            if (r8 <= r4) goto L58
            boolean r8 = r1.f5820C
            if (r8 == 0) goto L4a
            goto L58
        L4a:
            int r5 = r5 - r4
            r7[r2] = r5
            r4 = r7[r2]
            int r4 = -r4
            p227n0.C4661t.m10539o(r3, r4)
            r4 = 4
        L54:
            r1.m3285E(r4)
            goto L66
        L58:
            boolean r4 = r1.f5822E
            if (r4 != 0) goto L5d
            return
        L5d:
            r7[r2] = r6
        L5f:
            int r4 = -r6
            p227n0.C4661t.m10539o(r3, r4)
            r1.m3285E(r2)
        L66:
            int r3 = r3.getTop()
            r1.m3298w(r3)
            r1.f5826I = r6
            r1.f5827J = r2
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: l */
    public void mo996l(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4, int r5, int r6, int r7, int r8, int[] r9) {
            r0 = this;
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: n */
    public void mo998n(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.os.Parcelable r7) {
            r4 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior$e r7 = (com.google.android.material.bottomsheet.BottomSheetBehavior.C1132e) r7
            int r5 = r4.f5841a
            r6 = 1
            r0 = 2
            r1 = 4
            if (r5 != 0) goto La
            goto L34
        La:
            r2 = -1
            if (r5 == r2) goto L11
            r3 = r5 & 1
            if (r3 != r6) goto L15
        L11:
            int r3 = r7.f5874b0
            r4.f5844d = r3
        L15:
            if (r5 == r2) goto L1b
            r3 = r5 & 2
            if (r3 != r0) goto L1f
        L1b:
            boolean r3 = r7.f5875c0
            r4.f5842b = r3
        L1f:
            if (r5 == r2) goto L25
            r3 = r5 & 4
            if (r3 != r1) goto L29
        L25:
            boolean r3 = r7.f5876d0
            r4.f5820C = r3
        L29:
            if (r5 == r2) goto L30
            r2 = 8
            r5 = r5 & r2
            if (r5 != r2) goto L34
        L30:
            boolean r5 = r7.f5877e0
            r4.f5821D = r5
        L34:
            int r5 = r7.f5873a0
            if (r5 == r6) goto L3e
            if (r5 != r0) goto L3b
            goto L3e
        L3b:
            r4.f5823F = r5
            goto L40
        L3e:
            r4.f5823F = r1
        L40:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: o */
    public android.os.Parcelable mo999o(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2) {
            r0 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior$e r1 = new com.google.android.material.bottomsheet.BottomSheetBehavior$e
            android.view.AbsSavedState r2 = android.view.View.BaseSavedState.EMPTY_STATE
            r1.<init>(r2, r0)
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: p */
    public boolean mo1000p(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, android.view.View r4, int r5, int r6) {
            r0 = this;
            r1 = 0
            r0.f5826I = r1
            r0.f5827J = r1
            r2 = r5 & 2
            if (r2 == 0) goto La
            r1 = 1
        La:
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: q */
    public void mo1001q(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5) {
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.m3300z()
            r0 = 3
            if (r2 != r5) goto Lf
            r1.m3285E(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r2 = r1.f5832O
            if (r2 == 0) goto Lc0
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto Lc0
            boolean r2 = r1.f5827J
            if (r2 != 0) goto L1f
            goto Lc0
        L1f:
            int r2 = r1.f5826I
            if (r2 <= 0) goto L32
            boolean r2 = r1.f5842b
            if (r2 == 0) goto L28
            goto L72
        L28:
            int r2 = r3.getTop()
            int r4 = r1.f5865y
            if (r2 <= r4) goto L83
            goto Lb4
        L32:
            boolean r2 = r1.f5820C
            if (r2 == 0) goto L55
            android.view.VelocityTracker r2 = r1.f5834Q
            if (r2 != 0) goto L3c
            r2 = 0
            goto L4b
        L3c:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.f5843c
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.f5834Q
            int r4 = r1.f5835R
            float r2 = r2.getYVelocity(r4)
        L4b:
            boolean r2 = r1.m3288H(r3, r2)
            if (r2 == 0) goto L55
            int r2 = r1.f5830M
            r0 = 5
            goto Lba
        L55:
            int r2 = r1.f5826I
            if (r2 != 0) goto L98
            int r2 = r3.getTop()
            boolean r4 = r1.f5842b
            if (r4 == 0) goto L75
            int r4 = r1.f5864x
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f5818A
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lb7
        L72:
            int r2 = r1.f5864x
            goto Lba
        L75:
            int r4 = r1.f5865y
            if (r2 >= r4) goto L88
            int r4 = r1.f5818A
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 >= r4) goto Lb2
        L83:
            int r2 = r1.m3300z()
            goto Lba
        L88:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f5818A
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lb7
            goto Lb2
        L98:
            boolean r2 = r1.f5842b
            if (r2 == 0) goto L9d
            goto Lb7
        L9d:
            int r2 = r3.getTop()
            int r4 = r1.f5865y
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f5818A
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lb7
        Lb2:
            int r4 = r1.f5865y
        Lb4:
            r0 = 6
            r2 = r4
            goto Lba
        Lb7:
            int r2 = r1.f5818A
            r0 = 4
        Lba:
            r4 = 0
            r1.m3289I(r3, r0, r2, r4)
            r1.f5827J = r4
        Lc0:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: r */
    public boolean mo1002r(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.MotionEvent r6) {
            r3 = this;
            boolean r4 = r5.isShown()
            if (r4 != 0) goto L8
            r4 = 0
            return r4
        L8:
            int r4 = r6.getActionMasked()
            int r0 = r3.f5823F
            r1 = 1
            if (r0 != r1) goto L14
            if (r4 != 0) goto L14
            return r1
        L14:
            t0.c r0 = r3.f5824G
            if (r0 == 0) goto L1b
            r0.m12580n(r6)
        L1b:
            if (r4 != 0) goto L2a
            r0 = -1
            r3.f5835R = r0
            android.view.VelocityTracker r0 = r3.f5834Q
            if (r0 == 0) goto L2a
            r0.recycle()
            r0 = 0
            r3.f5834Q = r0
        L2a:
            android.view.VelocityTracker r0 = r3.f5834Q
            if (r0 != 0) goto L34
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r3.f5834Q = r0
        L34:
            android.view.VelocityTracker r0 = r3.f5834Q
            r0.addMovement(r6)
            t0.c r0 = r3.f5824G
            if (r0 == 0) goto L64
            r0 = 2
            if (r4 != r0) goto L64
            boolean r4 = r3.f5825H
            if (r4 != 0) goto L64
            int r4 = r3.f5836S
            float r4 = (float) r4
            float r0 = r6.getY()
            float r4 = r4 - r0
            float r4 = java.lang.Math.abs(r4)
            t0.c r0 = r3.f5824G
            int r2 = r0.f23522b
            float r2 = (float) r2
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L64
            int r4 = r6.getActionIndex()
            int r4 = r6.getPointerId(r4)
            r0.m12568b(r5, r4)
        L64:
            boolean r4 = r3.f5825H
            r4 = r4 ^ r1
            return r4
    }

    /* renamed from: s */
    public void m3294s(com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC1131d r2) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$d> r0 = r1.f5833P
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Ld
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$d> r0 = r1.f5833P
            r0.add(r2)
        Ld:
            return
    }

    /* renamed from: t */
    public final void m3295t() {
            r2 = this;
            int r0 = r2.m3296u()
            boolean r1 = r2.f5842b
            if (r1 == 0) goto L14
            int r1 = r2.f5830M
            int r1 = r1 - r0
            int r0 = r2.f5864x
            int r0 = java.lang.Math.max(r1, r0)
            r2.f5818A = r0
            goto L19
        L14:
            int r1 = r2.f5830M
            int r1 = r1 - r0
            r2.f5818A = r1
        L19:
            return
    }

    /* renamed from: u */
    public final int m3296u() {
            r3 = this;
            boolean r0 = r3.f5845e
            if (r0 == 0) goto L1d
            int r0 = r3.f5846f
            int r1 = r3.f5830M
            int r2 = r3.f5829L
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.f5828K
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r3.f5857q
            int r0 = r0 + r1
            return r0
        L1d:
            boolean r0 = r3.f5852l
            if (r0 != 0) goto L33
            boolean r0 = r3.f5853m
            if (r0 != 0) goto L33
            int r0 = r3.f5851k
            if (r0 <= 0) goto L33
            int r1 = r3.f5844d
            int r2 = r3.f5847g
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L33:
            int r0 = r3.f5844d
            int r1 = r3.f5857q
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: v */
    public final void m3297v(android.content.Context r3, android.util.AttributeSet r4, boolean r5, android.content.res.ColorStateList r6) {
            r2 = this;
            boolean r0 = r2.f5848h
            if (r0 == 0) goto L4a
            r0 = 2130968682(0x7f04006a, float:1.7546025E38)
            r1 = 2132017889(0x7f1402e1, float:1.967407E38)
            t8.i$b r4 = p340t8.C6192i.m12783b(r3, r4, r0, r1)
            t8.i r4 = r4.m12788a()
            r2.f5859s = r4
            t8.f r4 = new t8.f
            t8.i r0 = r2.f5859s
            r4.<init>(r0)
            r2.f5849i = r4
            t8.f$b r0 = r4.f24036Y
            j8.a r1 = new j8.a
            r1.<init>(r3)
            r0.f24060b = r1
            r4.m12781y()
            if (r5 == 0) goto L33
            if (r6 == 0) goto L33
            t8.f r3 = r2.f5849i
            r3.m12773q(r6)
            goto L4a
        L33:
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = 1
            r3.resolveAttribute(r5, r4, r6)
            t8.f r3 = r2.f5849i
            int r4 = r4.data
            r3.setTint(r4)
        L4a:
            return
    }

    /* renamed from: w */
    public void m3298w(int r4) {
            r3 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r3.f5831N
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L4a
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$d> r1 = r3.f5833P
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L4a
            int r1 = r3.f5818A
            if (r4 > r1) goto L29
            int r2 = r3.m3300z()
            if (r1 != r2) goto L1d
            goto L29
        L1d:
            int r1 = r3.f5818A
            int r4 = r1 - r4
            float r4 = (float) r4
            int r2 = r3.m3300z()
            int r1 = r1 - r2
            float r1 = (float) r1
            goto L32
        L29:
            int r1 = r3.f5818A
            int r4 = r1 - r4
            float r4 = (float) r4
            int r2 = r3.f5830M
            int r2 = r2 - r1
            float r1 = (float) r2
        L32:
            float r4 = r4 / r1
            r1 = 0
        L34:
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$d> r2 = r3.f5833P
            int r2 = r2.size()
            if (r1 >= r2) goto L4a
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$d> r2 = r3.f5833P
            java.lang.Object r2 = r2.get(r1)
            com.google.android.material.bottomsheet.BottomSheetBehavior$d r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC1131d) r2
            r2.mo2682a(r0, r4)
            int r1 = r1 + 1
            goto L34
        L4a:
            return
    }

    /* renamed from: x */
    public android.view.View m3299x(android.view.View r4) {
            r3 = this;
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.h.m10611p(r4)
            if (r0 == 0) goto L9
            return r4
        L9:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L24
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0 = 0
            int r1 = r4.getChildCount()
        L14:
            if (r0 >= r1) goto L24
            android.view.View r2 = r4.getChildAt(r0)
            android.view.View r2 = r3.m3299x(r2)
            if (r2 == 0) goto L21
            return r2
        L21:
            int r0 = r0 + 1
            goto L14
        L24:
            r4 = 0
            return r4
    }

    /* renamed from: z */
    public int m3300z() {
            r2 = this;
            boolean r0 = r2.f5842b
            if (r0 == 0) goto L7
            int r0 = r2.f5864x
            goto L15
        L7:
            int r0 = r2.f5863w
            boolean r1 = r2.f5856p
            if (r1 == 0) goto Lf
            r1 = 0
            goto L11
        Lf:
            int r1 = r2.f5858r
        L11:
            int r0 = java.lang.Math.max(r0, r1)
        L15:
            return r0
    }
}
