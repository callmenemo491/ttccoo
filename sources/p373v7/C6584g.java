package p373v7;

/* renamed from: v7.g */
/* loaded from: classes.dex */
public class C6584g {

    /* renamed from: a */
    public static final int[] f25755a = null;

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843848(0x1010448, float:2.369663E-38)
            r0[r1] = r2
            p373v7.C6584g.f25755a = r0
            return
    }

    /* renamed from: a */
    public static void m13455a(android.view.View r10, float r11) {
            android.content.res.Resources r0 = r10.getResources()
            r1 = 2131427333(0x7f0b0005, float:1.847628E38)
            int r0 = r0.getInteger(r1)
            android.animation.StateListAnimator r1 = new android.animation.StateListAnimator
            r1.<init>()
            r2 = 3
            int[] r2 = new int[r2]
            r2 = {x0058: FILL_ARRAY_DATA , data: [16842766, 2130969481, -2130969482} // fill-array
            r3 = 1
            float[] r4 = new float[r3]
            r5 = 0
            r6 = 0
            r4[r5] = r6
            java.lang.String r7 = "elevation"
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r10, r7, r4)
            long r8 = (long) r0
            android.animation.ObjectAnimator r0 = r4.setDuration(r8)
            r1.addState(r2, r0)
            int[] r0 = new int[r3]
            r2 = 16842766(0x101000e, float:2.3693597E-38)
            r0[r5] = r2
            float[] r2 = new float[r3]
            r2[r5] = r11
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r10, r7, r2)
            android.animation.ObjectAnimator r11 = r11.setDuration(r8)
            r1.addState(r0, r11)
            int[] r11 = new int[r5]
            float[] r0 = new float[r3]
            r0[r5] = r6
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r10, r7, r0)
            r2 = 0
            android.animation.ObjectAnimator r0 = r0.setDuration(r2)
            r1.addState(r11, r0)
            r10.setStateListAnimator(r1)
            return
    }
}
