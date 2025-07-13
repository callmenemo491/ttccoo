package p283q3;

import p161j3.AbstractC3395c;

/* renamed from: q3.b */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC5567b<T extends p161j3.AbstractC3395c<?>> extends android.view.GestureDetector.SimpleOnGestureListener implements android.view.View.OnTouchListener {

    /* renamed from: Y */
    public p283q3.AbstractViewOnTouchListenerC5567b.a f21680Y;

    /* renamed from: Z */
    public int f21681Z;

    /* renamed from: a0 */
    public p230n3.C4684b f21682a0;

    /* renamed from: b0 */
    public android.view.GestureDetector f21683b0;

    /* renamed from: c0 */
    public T f21684c0;

    /* renamed from: q3.b$a */
    public enum a extends java.lang.Enum<p283q3.AbstractViewOnTouchListenerC5567b.a> {

        /* renamed from: Y */
        public static final p283q3.AbstractViewOnTouchListenerC5567b.a f21685Y = null;

        /* renamed from: Z */
        public static final p283q3.AbstractViewOnTouchListenerC5567b.a f21686Z = null;

        /* renamed from: a0 */
        public static final p283q3.AbstractViewOnTouchListenerC5567b.a f21687a0 = null;

        /* renamed from: b0 */
        public static final p283q3.AbstractViewOnTouchListenerC5567b.a f21688b0 = null;

        /* renamed from: c0 */
        public static final p283q3.AbstractViewOnTouchListenerC5567b.a f21689c0 = null;

        /* renamed from: d0 */
        public static final p283q3.AbstractViewOnTouchListenerC5567b.a f21690d0 = null;

        /* renamed from: e0 */
        public static final p283q3.AbstractViewOnTouchListenerC5567b.a f21691e0 = null;

        /* renamed from: f0 */
        public static final p283q3.AbstractViewOnTouchListenerC5567b.a f21692f0 = null;

        /* renamed from: g0 */
        public static final p283q3.AbstractViewOnTouchListenerC5567b.a f21693g0 = null;

        /* renamed from: h0 */
        public static final /* synthetic */ p283q3.AbstractViewOnTouchListenerC5567b.a[] f21694h0 = null;

        static {
                q3.b$a r0 = new q3.b$a
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                p283q3.AbstractViewOnTouchListenerC5567b.a.f21685Y = r0
                q3.b$a r1 = new q3.b$a
                java.lang.String r3 = "DRAG"
                r4 = 1
                r1.<init>(r3, r4)
                p283q3.AbstractViewOnTouchListenerC5567b.a.f21686Z = r1
                q3.b$a r3 = new q3.b$a
                java.lang.String r5 = "X_ZOOM"
                r6 = 2
                r3.<init>(r5, r6)
                p283q3.AbstractViewOnTouchListenerC5567b.a.f21687a0 = r3
                q3.b$a r5 = new q3.b$a
                java.lang.String r7 = "Y_ZOOM"
                r8 = 3
                r5.<init>(r7, r8)
                p283q3.AbstractViewOnTouchListenerC5567b.a.f21688b0 = r5
                q3.b$a r7 = new q3.b$a
                java.lang.String r9 = "PINCH_ZOOM"
                r10 = 4
                r7.<init>(r9, r10)
                p283q3.AbstractViewOnTouchListenerC5567b.a.f21689c0 = r7
                q3.b$a r9 = new q3.b$a
                java.lang.String r11 = "ROTATE"
                r12 = 5
                r9.<init>(r11, r12)
                q3.b$a r11 = new q3.b$a
                java.lang.String r13 = "SINGLE_TAP"
                r14 = 6
                r11.<init>(r13, r14)
                p283q3.AbstractViewOnTouchListenerC5567b.a.f21690d0 = r11
                q3.b$a r13 = new q3.b$a
                java.lang.String r15 = "DOUBLE_TAP"
                r14 = 7
                r13.<init>(r15, r14)
                p283q3.AbstractViewOnTouchListenerC5567b.a.f21691e0 = r13
                q3.b$a r15 = new q3.b$a
                java.lang.String r14 = "LONG_PRESS"
                r12 = 8
                r15.<init>(r14, r12)
                p283q3.AbstractViewOnTouchListenerC5567b.a.f21692f0 = r15
                q3.b$a r14 = new q3.b$a
                java.lang.String r12 = "FLING"
                r10 = 9
                r14.<init>(r12, r10)
                p283q3.AbstractViewOnTouchListenerC5567b.a.f21693g0 = r14
                r12 = 10
                q3.b$a[] r12 = new p283q3.AbstractViewOnTouchListenerC5567b.a[r12]
                r12[r2] = r0
                r12[r4] = r1
                r12[r6] = r3
                r12[r8] = r5
                r0 = 4
                r12[r0] = r7
                r0 = 5
                r12[r0] = r9
                r0 = 6
                r12[r0] = r11
                r0 = 7
                r12[r0] = r13
                r0 = 8
                r12[r0] = r15
                r12[r10] = r14
                p283q3.AbstractViewOnTouchListenerC5567b.a.f21694h0 = r12
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static p283q3.AbstractViewOnTouchListenerC5567b.a valueOf(java.lang.String r1) {
                java.lang.Class<q3.b$a> r0 = p283q3.AbstractViewOnTouchListenerC5567b.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                q3.b$a r1 = (p283q3.AbstractViewOnTouchListenerC5567b.a) r1
                return r1
        }

        public static p283q3.AbstractViewOnTouchListenerC5567b.a[] values() {
                q3.b$a[] r0 = p283q3.AbstractViewOnTouchListenerC5567b.a.f21694h0
                java.lang.Object r0 = r0.clone()
                q3.b$a[] r0 = (p283q3.AbstractViewOnTouchListenerC5567b.a[]) r0
                return r0
        }
    }

    public AbstractViewOnTouchListenerC5567b(T r2) {
            r1 = this;
            r1.<init>()
            q3.b$a r0 = p283q3.AbstractViewOnTouchListenerC5567b.a.f21685Y
            r1.f21680Y = r0
            r0 = 0
            r1.f21681Z = r0
            r1.f21684c0 = r2
            android.view.GestureDetector r0 = new android.view.GestureDetector
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2, r1)
            r1.f21683b0 = r0
            return
    }
}
