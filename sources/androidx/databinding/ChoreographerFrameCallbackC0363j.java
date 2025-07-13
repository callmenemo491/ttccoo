package androidx.databinding;

/* renamed from: androidx.databinding.j */
/* loaded from: classes.dex */
public class ChoreographerFrameCallbackC0363j implements android.view.Choreographer.FrameCallback {

    /* renamed from: Y */
    public final /* synthetic */ androidx.databinding.ViewDataBinding f2020Y;

    public ChoreographerFrameCallbackC0363j(androidx.databinding.ViewDataBinding r1) {
            r0 = this;
            r0.f2020Y = r1
            r0.<init>()
            return
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long r1) {
            r0 = this;
            androidx.databinding.ViewDataBinding r1 = r0.f2020Y
            java.lang.Runnable r1 = r1.f2002b
            r1.run()
            return
    }
}
